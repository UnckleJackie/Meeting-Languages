'''Даны два массива чисел. Требуется вывести те элементы
первого массива (в том порядке, в каком они идут в первом
массиве), которых нет во втором массиве. Пользователь вводит
число N - количество элементов в первом массиве, затем N
чисел - элементы массива. Затем число M - количество
элементов во втором массиве. Затем элементы второго массива
Ввод:               Вывод:
7                   3 3 2 12
3 1 3 4 2 4 12
6
4 15 43 1 15 1 (каждое число вводится с новой строки)'''

import random

len1 = int(input('Enter the length of the first list: '))
len2 = int(input('Enter the length of the second list: '))

lst1 = [random.randint(0, 20) for _ in range(len1)]
lst2 = set([random.randint(0, 20) for _ in range(len2)])
print(lst1)
print(lst2)

for elem in lst1:
    if elem not in lst2:
        print(elem, end = ' ')