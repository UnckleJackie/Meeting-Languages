from bs4 import BeautifulSoup
from selenium import webdriver
from selenium.webdriver.firefox.firefox_binary import FirefoxBinary
from selenium.webdriver.common.action_chains import ActionChains
from selenium.webdriver.support import ui
from selenium.webdriver.firefox.service import Service
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC

import locale
import pymysql.cursors
import re
import logging
import time
import json
import hashlib


def save_game(data_for_save):
    logger.info('Save game to mysql')
    db_connect = pymysql.connect(host='192.168.165.165', user='stat', password='YtGhjcnj5690!', db='football',
                                 cursorclass=pymysql.cursors.DictCursor)
    try:
        with db_connect.cursor() as cursor:
            cursor.execute("""insert `bb_data` VALUES (%(game_id)s, %(day_of_week)s, %(game_liga)s, %(game_date)s, 
            %(result)s, %(1time)s, %(game_name)s, %(toto)s, %(red_card)s, %(penalties)s, %(p1)s, %(x)s, %(p2)s, 
            %(f10)s, %(f20)s, %(tm25)s, %(tb25)s, %(oz)s, %(p1p1)s, %(np1)s, %(p2p1)s, %(p1n)s, %(nn)s, %(p2n)s, 
            %(p1p2)s, %(np2)s, %(p2p2)s) ON DUPLICATE KEY UPDATE result=%(result)s,1time=%(1time)s""", data_for_save)
            db_connect.commit()
    except Exception as e:
        logger.error('Error insert game info %s', str(e))
    finally:
        db_connect.close()


logger = logging.getLogger("grabberBB")
logger.setLevel(logging.INFO)
fh = logging.FileHandler("grabber_bb.log")
formatter = logging.Formatter('%(asctime)s - %(name)s - %(levelname)s - %(message)s')
fh.setFormatter(formatter)
logger.addHandler(fh)
logger.info("Grabber started")

base_url = 'https://bet-baza.com/'


links_result = {}
game_links = []
liga_name = ""
liga_land = ""
WAIT_TIME = 3  # max waiting time for a page to load
hours_count = 24
# options = webdriver.FirefoxOptions()
# options.headless = True
# options.binary_location = '/usr/bin/firefox'
# options = webdriver.SafariOptions()
# driver_service = Service('/usr/local/bin/geckodriver')

browser = None
try:
    logger.info("Time to load")
    with open('bb-data.json') as f:
        games_data_json = json.load(f)
    logger.info(f'Total records {games_data_json["recordsTotal"]} and length data {len(games_data_json["data"])}')
    for game, el in enumerate(games_data_json["data"]):
        if game > -1:
            pattern_liga = '>.+<'
            game_liga = re.findall(pattern_liga, games_data_json["data"][game][1])[0][1:-1]
            data_object = {
                'game_id': '',
                'day_of_week': games_data_json["data"][game][0],
                'game_liga': game_liga,
                'game_date': re.findall(r'\d{10}', games_data_json["data"][game][2])[0],
                'result': games_data_json["data"][game][3],
                '1time': games_data_json["data"][game][4],
                'game_name': games_data_json["data"][game][5],
                'toto': False,
                'red_card': games_data_json["data"][game][6],
                'penalties': games_data_json["data"][game][7],
                'p1': games_data_json["data"][game][8] if games_data_json["data"][game][8] != '' else '0',
                'x': games_data_json["data"][game][9] if games_data_json["data"][game][9] != '' else '0',
                'p2': games_data_json["data"][game][10] if games_data_json["data"][game][10] != '' else '0',
                'f10': games_data_json["data"][game][11] if games_data_json["data"][game][11] != '' else '0',
                'f20': games_data_json["data"][game][12] if games_data_json["data"][game][12] != '' else '0',
                'tm25': games_data_json["data"][game][13] if games_data_json["data"][game][13] != '' else '0',
                'tb25': games_data_json["data"][game][14] if games_data_json["data"][game][14] != '' else '0',
                'oz': games_data_json["data"][game][15] if games_data_json["data"][game][15] != '' else '0',
                'p1p1': games_data_json["data"][game][16] if games_data_json["data"][game][16] != '' else '0',
                'np1': games_data_json["data"][game][17] if games_data_json["data"][game][17] != '' else '0',
                'p2p1': games_data_json["data"][game][18] if games_data_json["data"][game][18] != '' else '0',
                'p1n': games_data_json["data"][game][19] if games_data_json["data"][game][19] != '' else '0',
                'nn': games_data_json["data"][game][20] if games_data_json["data"][game][20] != '' else '0',
                'p2n': games_data_json["data"][game][21] if games_data_json["data"][game][21] != '' else '0',
                'p1p2': games_data_json["data"][game][22] if games_data_json["data"][game][22] != '' else '0',
                'np2': games_data_json["data"][game][23] if games_data_json["data"][game][23] != '' else '0',
                'p2p2': games_data_json["data"][game][24] if games_data_json["data"][game][24] != '' else '0'
            }
            if data_object["game_name"].find('>T<') > 0:
                data_object['toto'] = True
                data_object['game_name'] = data_object['game_name'][data_object['game_name'].find('/div>') + 6:]
            game_id = hashlib.md5((data_object["game_date"] + data_object["game_name"]
                                   + data_object["game_liga"]).encode())
            data_object['game_id'] = game_id.hexdigest()
            logger.info(f'game data {data_object}')
            save_game(data_object)
        else:
            break

    # browser = webdriver.Safari()
    # browser = webdriver.Firefox(service = driver_service, options = options)
    # options = webdriver.ChromeOptions()
    # options.add_argument('--no-sandbox')
    # options.add_argument('--window-size=1420,1080')
    # options.add_argument('--headless')
    # options.add_argument('--disable-gpu')
    # service = Service('/usr/local/bin/chromedriver')
    # browser = webdriver.Chrome(service=service, options=options)
    # logger.info('Chrome browser opened in headless mode')
    # browser.get(base_url)
    # time.sleep(20)
    # logger.info(f'page source {browser.page_source}')
    # login = browser.find_element(By.NAME, "login")
    # password = browser.find_element(By.NAME, "password")
    # login_button = browser.find_element(By.XPATH, '/html/body/section[2]/div/div[1]/div[2]/form/div[1]/button')
    # login.send_keys('kil82')
    # password.send_keys('YtGhjcnj5690!')
    # login_button.click()
    # time.sleep(20)
    # logger.info(f'page source {browser.page_source}')
    # browser.get('https://bet-baza.com/main/getdata?_=1701024697734')
    # time.sleep(60)
    # downloaded_file = open("bb_data.html", "wb")
    # downloaded_file.writelines(browser.page_source)
    # downloaded_file.close()
    # page_html = str(browser.page_source)
    # logger.info('Page_html %s', page_html)
    # logger.info('Prepare obj %s', page_html[25:-3403])
    # start_pos = page_html.find('<body>') + 6
    # end_pos = page_html.find(']]}') + 3
    # tmp_str = page_html[start_pos:end_pos]
    # tmp_str = tmp_str.replace('="', '=\'');
    # tmp_str = tmp_str.replace('">', '\'>');
    # tmp_str = tmp_str.replace('\&quot;', '\\"')
    # tmp_str = tmp_str.replace('&lt;\\', '<')
    # tmp_str = tmp_str.replace('&gt;', '>')
    # tmp_str = tmp_str.replace('\>', '>')
    # tmp_str = tmp_str.replace('" ', '\' ')
    # logger.info('Prepare obj %s', tmp_str)
    # json_obj = json.loads(tmp_str)
    # logger.info('End current parse %s', str(json.dumps(json_obj, indent=2)))
    # browser.get('https://bet-baza.com/main/logout')
    # time.sleep(10)
# counter = 0
# for i in range(0, len(json_obj['data']), 1):
# 	# counter = counter + 1
# 	game_liga = json_obj['data'][i][1]
# 	start_pos = game_liga.find('\'>')+2
# 	game_liga = game_liga[start_pos:-7]
# 	game_date = json_obj['data'][i][2]
# 	start_pos = game_date.find('\'>')+2
# 	game_date = game_date[start_pos:start_pos+10]
# 	game_name = json_obj['data'][i][5]
# 	toto = None
# 	if game_name.find('toto') > -1:
# 		start_pos = game_name.find('</div> ') + 7
# 		game_name = game_name[start_pos:]
# 		toto = 't'
# 	elif game_name.find('href') > -1:
# 		start_pos = game_name.find('\'>') + 2
# 		game_name = game_name[start_pos:-4].replace('</a>', '')
#
# 	game_name = game_name.replace('</span>', '').replace('\'', '\\\'')
# 	logger.info('Game liga %s, game date %s, game name %s', game_liga, game_date, game_name)
# 	if int(game_date) < int(time.time())-(60*60*hours_count):
# 		logger.info("Old game, skip")
# 		continue
# 	loaded_game = check_loaded_game({'game_date': game_date, 'game_name': game_name})
# 	if loaded_game['cnt'] > 0:
# 		logger.info('Game loaded, skip')
# 		continue
# 	game_info = {
# 		'game_date': game_date,
# 		'game_liga': game_liga,
# 		'game_name': game_name,
# 		'day_name': json_obj['data'][i][0],
# 		'score': json_obj['data'][i][3],
# 		'r1time': json_obj['data'][i][4],
# 		'p1': json_obj['data'][i][6],
# 		'x': json_obj['data'][i][7],
# 		'p2': json_obj['data'][i][8],
# 		'f10': json_obj['data'][i][9],
# 		'f20': json_obj['data'][i][10],
# 		'tm25': json_obj['data'][i][11],
# 		'tb25': json_obj['data'][i][12],
# 		'oz': json_obj['data'][i][13],
# 		'p1p1': json_obj['data'][i][14],
# 		'np1': json_obj['data'][i][15],
# 		'p2p1': json_obj['data'][i][16],
# 		'p1n': json_obj['data'][i][17],
# 		'nn': json_obj['data'][i][18],
# 		'p2n': json_obj['data'][i][19],
# 		'p1p2': json_obj['data'][i][20],
# 		'np2': json_obj['data'][i][21],
# 		'p2p2': json_obj['data'][i][22],
# 		'toto': toto
# 	}
# 	save_game(game_info)
# if counter == 10:
#	break

except Exception as e:
    logger.exception('Error get games info %s', str(e))
# finally:
#     browser.quit()
logger.info('End parser')
# browser.quit()
