# Напишите рекурсивную функцию sum(a, b),
# возвращающую сумму двух целых неотрицательных чисел. Из
# всех арифметических операций допускаются только +1 и -1.
# Также нельзя использовать циклы.
# 2 2 -> 4

def rec_sum(num_1, num_2):
    if num_2 == 0:
        return num_1
    return 1 + rec_sum(num_1, num_2 - 1)

num_1 = int(input('Enter A: '))
num_2 = int(input('Enter B: '))
print(rec_sum(num_1, num_2))