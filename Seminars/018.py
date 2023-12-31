# Требуется найти в массиве A[1..N] самый близкий по
# величине элемент к заданному числу X. Пользователь в первой строке
# вводит натуральное число N – количество элементов в массиве. В
# последующих строках записаны N целых чисел Ai. 
# Последняя строкасодержит число X

# list_1 = [int(i) for i in input().split()]
list_1 = [1, 12, 6, 7, 8, 15]
target = 11
# target = int(input())
nearest = None
nearest_diff = None

for i in list_1:
    diff = abs(i - target)
    if nearest_diff is None or diff < nearest_diff:
        nearest = i
        nearest_diff = diff
print(nearest)