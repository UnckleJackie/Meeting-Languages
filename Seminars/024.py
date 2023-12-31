# В фермерском хозяйстве в Карелии выращивают чернику. Она растет на
# круглой грядке, причем кусты высажены только по окружности. Таким образом, у
# каждого куста есть ровно два соседних. Всего на грядке растет N кустов.
# Эти кусты обладают разной урожайностью, поэтому ко времени сбора на них
# выросло различное число ягод – на i-ом кусте выросло ai
#  ягод.
# В этом фермерском хозяйстве внедрена система автоматического сбора черники.
# Эта система состоит из управляющего модуля и нескольких собирающих модулей.
# Собирающий модуль за один заход, находясь непосредственно перед некоторым
# кустом, собирает ягоды с этого куста и с двух соседних с ним.
# Напишите программу для нахождения максимального числа ягод, которое может
# собрать за один заход собирающий модуль, находясь перед некоторым кустом
# заданной во входном файле грядки.
# 4 -> 1 2 3 4
# 9
# import random
# bushes = [random.randint(1, 15) for _ in range(10)]

# max_berries = 0
# for i in range(len(bushes)):
#     if i == len(bushes) - 1: 
#         total = bushes[(i - 1) % len(bushes)] + bushes[i % len(bushes)] + bushes[(i + 1) % len(bushes)]
#         if total > max_berries:
#             max_berries = total

# print(max_berries)


# n = int(input())
arr = [5, 8, 6, 4, 9, 2, 7, 3] # list()
# for i in range(n):
#     x = int(input())
#     arr.append(x)

arr_count = list()
for i in range(len(arr) - 1):
    arr_count.append(arr[i - 1] + arr[i] + arr[i + 1])
arr_count.append(arr[-2] + arr[-1] + arr[0])
print(max(arr_count))


# arr = [5, 8, 6, 4, 9, 2, 7, 3]
# max_berries = 0
# for i in range(len(arr) - 1):
#     if i == len(arr) - 1:
#         total = arr[i - 1] + arr[i] + arr[i + 1]
#         if total > max_berries:
#             max_berries = total
# print(max_berries)
