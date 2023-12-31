'''Дан массив, состоящий из целых чисел. Напишите
программу, которая в данном массиве определит
количество элементов, у которых два соседних и, при
этом, оба соседних элемента меньше данного. Сначала
вводится число N — количество элементов в массиве
Далее записаны N чисел — элементы массива. Массив
состоит из целых чисел.
Ввод: Ввод:
5 5
1 2 3 4 5 1 5 1 5 1
Вывод: Вывод:
0 2
(каждое число вводится с новой строки)'''

import random
len1 = int(input('Enter the length of list: '))
lst1 = [random.randint(0, 10) for _ in range(len1)]
print(lst1)
count = 0
for i in range(1, len1 - 1):
    if lst1[i] > lst1[i - 1] and lst1[i] > lst1[i + 1]:
        count += 1

# list comprehension
# [] - list compr
# {} - set compr
# {:} - dict compr
# () - tuple compr

result = [1 for i in range(1, len1 - 1) if lst1[i] > lst1[i - 1] and lst1[i] > lst1[i + 1]]
    
print(result)


# lst = [[1, 2], [4, 5], [6, 1, 3]]
# print([max(i)])

obj1 = [random.randint(0, 100) for _ in range(10)]
obj2 = {random.randint(0, 100) for _ in range(10)}
obj3 = {random.randint(100, 10000): random.randint(0, 100) for _ in range(10)}
obj4 = (random.randint(100, 10000) for _ in range(10))

print(obj1)
print(type(obj1))
print(obj2)
print(type(obj2))
print(obj3)
print(type(obj3))
print(obj4)
print(type(obj4))