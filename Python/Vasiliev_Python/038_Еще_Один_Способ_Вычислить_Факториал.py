def factorial(n):  # Ф-я для выч-я факториала числа
    if n == 1:
        return 1
    else:  # Рекурсия
        return n * factorial(n - 1)
def dfactorial(n):  # Функция для вычисления двойного факториала
    if n == 1 or n == 2:
        return n
    else:  # Рекурсия
        return n * dfactorial(n - 2)
def factor(mode = True):  # Ф-я для выч-я факт и двойного факт
    return factorial if mode else dfactorial  # Рез-т - ссылка на внеш ф-ю
n = int(input("Введите число: "))
print(f"{n}! =", factor()(n))  # Выз-м ф-ю factor() для выч-я факт 
print(f"{n}! =", factor(True)(n))
print(f"{n}!! =", factor(False)(n))  # Выз-м ф-ю для выч-я двойного факт