import random
attempt = 25
wrong_attempt = 0

print(f'\n\n\n  ---------------------!БАМБАРБИЯ!---------------------'
      f'\n  Привет, Мирослав! Потреним в таблице умножения сейчас'
      f'\n  Количество примеров, которые мы решим ПРАВИЛЬНО: {attempt} '
      f'\n  Будь внимателен, потому что неправильные ответы не будут засчитываться. '
      f'\n  А если ты введешь вместо цифр что-то другое, то программа вылетит и придется начинать сначала.'
      f'\n  Итак, погнали! \n')

while attempt > 0:
    first_number = random.randint(1, 10)
    second_number = random.randint(1, 10)
    print(f'  Осталось примеров {attempt}. Пример: {first_number} x {second_number}'
          f'\n  Твой ответ: {first_number} x {second_number} = ', end = '')
    try:
        if int(input()) == first_number * second_number:
            print(f'  Малатэс! Правильно\n')
        else:
            print(f'  Неверно! Правильный ответ: {first_number * second_number}. Не торопись, ты же ГОЛОВА!)\n')
            attempt += 1
            wrong_attempt += 1
    except Exception as ex:
        print(f'Ты явно не число ввел или что-то не то {ex}\n')
        attempt += 1
        wrong_attempt += 1
    finally:
        attempt -= 1
print(f'  Я тебя поздравляю, Гжушпештик!!! Ты осилил все примеры! Красавчик!'
      f'\n  Неверных попыток было: {wrong_attempt}\n')
input()
