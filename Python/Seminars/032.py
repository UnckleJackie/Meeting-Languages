'''Определить индексы элементов массива (списка), 
значения которых принадлежат заданному диапазону
(т.е. не меньше заданного минимума и не больше заданного максимума)
Ввод: [-5, 9, 0, 3, -1, -2, 1, 4, -2, 10, 2, 0, -9, 8, 10, -9, 0, -5, -5, 7]
Вывод: [1, 9, 13, 14, 19]'''

import random
# bushes = [random.randint(1, 15) for _ in range(10)]
# list_1 = [random.randint(-30, 30) for _ in range(random.randint(20, 30))]
# print(list_1)
# print(f'Length of your list is {len(list_1)}')
# list_2 = []
# num_min = int(input('Enter minimum number: '))
# num_max = int(input('Enter maximum number: '))

# for i in range(len(list_1)):
#     if list_1[i] >= num_min and list_1[i] <= num_max:
#         list_2.append(i)
# print(f'Indexes of numers in your range: {list_2}')


list_1 = [-5, 9, 0, 3, -1, -2, 1, 4, -2, 10, 2, 0, -9, 8, 10, -9, 0, -5, -5, 7]
min_number = 0
max_number = 10

for i in range(len(list_1)):
    if list_1[i] >= min_number and list_1[i] <= max_number:
        print(i)