import random
attempt = 25
wrong_attempt = 0
print()
print()
print()
print('  ---------------------!БАМБАРБИЯ!---------------------')
print('  Привет, Мирослав! Потреним в таблице умножения сейчас')
print(f'  Количество примеров, которые мы решим ПРАВИЛЬНО: {attempt} ')
print('  Будь внимателен, потому что неправильные ответы не будут засчитываться.')
print('  А если ты введешь вместо цифр что-то другое, то программа вылетит и придется начинать сначала.')
print('  Итак, погнали! ')
print()

while attempt > 0:
    first_number = random.randint(1, 10)
    second_number = random.randint(1, 10)
    print(f'  Осталось примеров {attempt}. Пример: {first_number} x {second_number}')
    print(f'  Твой ответ: {first_number} x {second_number} = ', end = '')
    if int(input()) == first_number * second_number:
        print('  Малатэс! Правильно')
        print()
    else:
        print(f'  Неверно! Правильный ответ:', first_number * second_number, 'Не торопись, ты же ГОЛОВА!)')
        print()
        attempt += 1
        wrong_attempt += 1
    attempt -= 1
print('  Я тебя поздравляю, Гжушпештик!!! Ты осилил все примеры! Красавчик!')
print('  Неверных попыток было:', wrong_attempt)
print()
input()