import random
attempt = 250
wrong_attempt = 0
print()
print()
print()
print('  ---------------------!БАМБАРБИЯ!---------------------')
print('  Привет, Гжушпештик! Нам надо осилить таблицу умножения')
print(f'  Количество примеров, которые мы решим ПРАВИЛЬНО: {attempt} ')
print('  Будь внимателен, потому что неправильные ответы не будут засчитываться.')
print('  А если ты введешь вместо цифр что-то другое, то программа вылетит и придется начинать сначала.')
print('  Короче, задач дахуа, но ты не бзди! Погнали! ')
print()

while attempt > 0:
    first_number = random.randint(1, 12)
    second_number = random.randint(1, 10)
    # rectangle = print(' ' * 8,'-' * first_number)
    # print(' ' * 7, '|', ' ' * (first_number - 2), '|')
    # print(' ' * 8,'-' * first_number)
    print(f'''  Осталось задач: {attempt}.
    Итак, Задача: 
          У нас есть Прямоугольник. 
          Одна сторона - {first_number}. 
          Вторая сторона -  {second_number}
        Какова ПЛОЩАДЬ прямоугольника: ''', end = '')
    # print(rectangle)
    if int(input()) == first_number * second_number:
        print('    Малатэс! Правильно')
        print()
    else:
        print(f'    Неверно! Правильный ответ:', first_number * second_number, 'Не торопись, ты же ГОЛОВА!)')
        print()
    print('    Теперь посчитай ПЕРИМЕТР: ', end = '')
    if int(input()) == (first_number + second_number) * 2:
        print('    Да !!! В точечку!!!\n')
    else:
        print('    Наверное ты забыл как считать периметр. Вспоминай')
        print(f'    Ведь Периметр равен ({first_number} + {second_number}) x 2 = {(first_number + second_number) * 2}\n')
        attempt += 1
        wrong_attempt += 1
    attempt -= 1
print('    Я тебя поздравляю, Гжушпештик!!! Ты осилил все примеры! Красавчик!')
print('    Неверных попыток было:', wrong_attempt)
print()
input()