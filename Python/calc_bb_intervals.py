import pymysql.cursors
import logging


logger = logging.getLogger("calcBB")
logger.setLevel(logging.INFO)
fh = logging.FileHandler("calc_bb.log")
formatter = logging.Formatter('%(asctime)s - %(name)s - %(levelname)s - %(message)s')
fh.setFormatter(formatter)
logger.addHandler(fh)
logger.info("Calculate started")


def get_truncate_p1():
    logger.info('Get truncate p1 kef from bb_data')
    query = """select TRUNCATE(p1, 1) 
    from bb_data group by TRUNCATE(p1, 1) order by TRUNCATE(p1, 1)"""
    db_connect = pymysql.connect(host='localhost', user='grabbers', password='YtGhjcnj5690!', db='football',
                                 cursorclass=pymysql.cursors.DictCursor)
    try:
        with db_connect.cursor() as cursor:
            cursor.execute(query)
            result = cursor.fetchall()
    finally:
        db_connect.close()
    return result


def get_truncate_x(kef_value):
    logger.info(f'Get truncate kefs x for kef value {kef_value}')
    query = f'select truncate(x, 1) from bb_data where truncate(p1, 1) = {kef_value} group by truncate(x, 1)'
    db_connect = pymysql.connect(host='localhost', user='grabbers', password='YtGhjcnj5690!', db='football',
                                 cursorclass=pymysql.cursors.DictCursor)
    try:
        with db_connect.cursor() as cursor:
            cursor.execute(query)
            result = cursor.fetchall()
    finally:
        db_connect.close()
    return result


def get_truncate_p2(p1_value, x_value):
    logger.info(f'Get truncate kefs p2 for kef value {p1_value}')
    query = f'select truncate(p2, 1) from bb_data where truncate(p1,1) = {p1_value} ' \
            f'and truncate(x, 1) = {x_value} group by truncate(p2, 1)'
    db_connect = pymysql.connect(host='localhost', user='grabbers', password='YtGhjcnj5690!', db='football',
                                 cursorclass=pymysql.cursors.DictCursor)
    try:
        with db_connect.cursor() as cursor:
            cursor.execute(query)
            result = cursor.fetchall()
    finally:
        db_connect.close()
    return result


def get_game_list(p1, x, p2):
    query = f'select * from bb_data where truncate(p1, 1) = {p1} and truncate(x, 1) = {x} and truncate(p2, 1) = {p2} ' \
            f'and result <> ""'
    logger.info(f'Get game list with query {query}')
    db_connect = pymysql.connect(host='localhost', user='grabbers', password='YtGhjcnj5690!', db='football',
                                 cursorclass=pymysql.cursors.DictCursor)
    try:
        with db_connect.cursor() as cursor:
            cursor.execute(query)
            result = cursor.fetchall()
    finally:
        db_connect.close()
    return result


def calc_stat(games_list):
    logger.info('Calculate stat')
    stat_obj = {
        'games_count': len(games_list),
        'p1_win': 0,
        'x_win': 0,
        'p2_win': 0,
        'tm25': 0,
        'tb25': 0,
        'ozy': 0,
        'ozn': 0,
        'f10': 0,
        'f20': 0,
        'p1p1': 0,
        'np1': 0,
        'p2p1': 0,
        'p1n': 0,
        'p1p2': 0,
        'np2': 0,
        'p2p2': 0,
        'p1_win_flat': 0,
        'x_win_flat': 0,
        'p2_win_flat': 0,
        'tm25_flat': 0,
        'tb25_flat': 0,
        'ozy_flat': 0,
        'f10_flat': 0,
        'f20_flat': 0,
        'p1p1_flat': 0,
        'np1_flat': 0,
        'p2p1_flat': 0,
        'p1n_flat': 0,
        'p1p2_flat': 0,
        'np2_flat': 0,
        'p2p2_flat': 0,
        'p2n': 0,
        'p2n_flat': 0,
        'nn': 0,
        'nn_flat': 0
    }
    for game in games_list:
        if game['1time'] == '' or game['result'] == '':
            continue
        p1_score_1t = int(game['1time'][:game['1time'].find('-')])
        p2_score_1t = int(game['1time'][game['1time'].find('-') + 1:])
        p1_score = int(game['result'][:game['result'].find('-')])
        p2_score = int(game['result'][game['result'].find('-') + 1:])
        logger.info(f'game 1time {game["1time"]}, result {game["result"]}, p1_score_1t {p1_score_1t}, '
                    f'p2_score_1t {p2_score_1t}, p1_score {p1_score}, p2_score {p2_score}')
        if p1_score > 0 and p2_score > 0:
            stat_obj['ozy'] += 1
            stat_obj['ozy_flat'] += game['oz'] - 1
        else:
            stat_obj['ozn'] += 1
        if p1_score + p2_score > 2:
            stat_obj['tb25'] += 1
            stat_obj['tb25_flat'] += game['tb25'] - 1
        else:
            stat_obj['tm25'] += 1
            stat_obj['tm25_flat'] += game['tm25'] - 1
        if p1_score == p2_score:
            stat_obj['x_win'] += 1
            stat_obj['x_win_flat'] += game['x'] - 1
            stat_obj['f10'] += 1
            stat_obj['f10_flat'] += game['f10'] - 1
            stat_obj['f20'] += 1
            stat_obj['f20_flat'] += game['f20'] - 1
            if p1_score_1t > p2_score_1t:
                stat_obj['p1n'] += 1
                stat_obj['p1n_flat'] += game['p1n'] - 1
            elif p1_score_1t < p2_score_1t:
                stat_obj['p2n'] += 1
                stat_obj['p2n_flat'] += game['p2n']
            else:
                stat_obj['nn'] += 1
                stat_obj['nn_flat'] += game['nn'] - 1
        elif p1_score > p2_score:
            stat_obj['p1_win'] += 1
            stat_obj['p1_win_flat'] += game['p1'] - 1
            stat_obj['f10'] += 1
            stat_obj['f10_flat'] += game['f10'] - 1
            if p1_score_1t > p2_score_1t:
                stat_obj['p1p1'] += 1
                stat_obj['p1p1_flat'] += game['p1p1'] - 1
            elif p1_score_1t < p2_score_1t:
                stat_obj['p2p1'] += 1
                stat_obj['p2p1_flat'] += game['p2p1']
            else:
                stat_obj['np1'] += 1
                stat_obj['np1_flat'] += game['np1'] - 1
        elif p2_score > p1_score:
            stat_obj['p2_win'] += 1
            stat_obj['p2_win_flat'] += game['p2'] - 1
            stat_obj['f20'] += 1
            stat_obj['f20_flat'] += game['f20'] - 1
            if p1_score_1t > p2_score_1t:
                stat_obj['p1p2'] += 1
                stat_obj['p1p2_flat'] += game['p1p2'] - 1
            elif p1_score_1t < p2_score_1t:
                stat_obj['p2p2'] += 1
                stat_obj['p2p2_flat'] += game['p2p2']
            else:
                stat_obj['np2'] += 1
                stat_obj['np2_flat'] += game['np2'] - 1
    return stat_obj


for p1_kef in get_truncate_p1():
    # logger.info(f'get for {p1_kef}')
    for x_kef in get_truncate_x(p1_kef['TRUNCATE(p1, 1)']):
        # logger.info(f'kef x for {p1_kef["TRUNCATE(p1, 1)"]} - {x_kef}')
        for p2_kef in get_truncate_p2(p1_kef["TRUNCATE(p1, 1)"], x_kef["truncate(x, 1)"]):
            logger.info(f'Get game list for kefs: {p1_kef["TRUNCATE(p1, 1)"]}, {x_kef["truncate(x, 1)"]}, '
                        f'{p2_kef["truncate(p2, 1)"]}')
            games = get_game_list(p1_kef["TRUNCATE(p1, 1)"], x_kef["truncate(x, 1)"], p2_kef["truncate(p2, 1)"])
            if len(games) > 1:
                ks = calc_stat(games)
                logger.info(f'kef stat;{p1_kef["TRUNCATE(p1, 1)"]};{x_kef["truncate(x, 1)"]};'
                            f'{p2_kef["truncate(p2, 1)"]};{ks["games_count"]};{ks["p1_win"]};{ks["p1_win_flat"]};'
                            f'{ks["p2_win"]};{ks["p2_win_flat"]};{ks["x_win"]};{ks["x_win_flat"]};{ks["tm25"]};'
                            f'{ks["tm25_flat"]};{ks["tb25"]};{ks["tb25_flat"]};{ks["ozy"]};{ks["ozy_flat"]};'
                            f'{ks["ozn"]};{ks["f10"]};{ks["f10_flat"]};{ks["f20"]};{ks["f20_flat"]};{ks["p1p1"]};'
                            f'{ks["p1p1_flat"]};{ks["np1"]};{ks["np1_flat"]};{ks["p2p1"]};{ks["p2p1_flat"]};'
                            f'{ks["p1n"]};{ks["p1n_flat"]};{ks["p1p2"]};{ks["p1p2_flat"]};{ks["np2"]};'
                            f'{ks["np2_flat"]};{ks["p2p2"]};{ks["p2p2_flat"]};{ks["p2n"]};{ks["p2n_flat"]};{ks["nn"]};'
                            f'{ks["nn_flat"]}')

logger.info('End calculate')
