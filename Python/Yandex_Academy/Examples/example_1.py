# print("Привет, Яндекс!")
# print('Hi, Dudes and Mazafackaz!')
# print("""Hi, Dudes and Mazafackaz!""")
# print("This Program prints string 'Hi, Dudes and Mazafackaz!'")

yesterday_temp = int(input())
today_temp = int(input())
if today_temp > yesterday_temp:
    print("Today is warmer than yesterday")
elif today_temp < yesterday_temp:
    print("Today is colder than yesterday")
else:
    print("Today such temperature as yesterday")