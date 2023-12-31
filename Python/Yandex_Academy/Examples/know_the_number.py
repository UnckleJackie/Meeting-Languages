import random
number_random = random.randint(1, 1000000000)
#print(number_random)
attempt = 1

while True:
    print(f"Попытка No.{attempt}")
    number_user = int(input("Твое число: "))
    attempt += 1
    if number_random == number_user:
        print("Ахуеть, Мазафака, ты ОТГАДАЛ, ипать меня в ухо!!!", number_random)
        break
    elif number_random > number_user:
        print("Не, братишка, мое число больше!")
    elif number_random < number_user:
        print("Чувак, я загадал меньше!")