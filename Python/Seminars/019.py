# Дана последовательность из N целых чисел и число
# K. Необходимо сдвинуть всю последовательность
# (сдвиг - циклический) на K элементов вправо, K –
# положительное число.
# Input: [1, 2, 3, 4, 5] k = 3
# Output: [4, 5, 1, 2, 3]
# Примечание: Пользователь может вводить значения
# списка или список задан изначально.

list_1 = [11, 2, 3, 4, 5]
key = 3
list_2 = list_1[:key]
list_3 = list_1[key:]
list_4 = list_3 + list_2
print(list_2, list_3)
print(list_4)
# key = key % len(list_1)
# #if key < len(list_1):
# for i in range(len(list_1)):
#     if (i + key) > (len(list_1) - 1):
#         temp = i + key - len(list_1)
#         list_2.append(list_1[temp])
#     else:
#         list_2.append(list_1[i + key])
# print(list_2)

lst = [1, 2, 3, 4, 5]

lst_shifted = []
shift = 3
for i in range(len(lst)):
    lst_shifted.append(lst[(i + shift) % len(lst)])
print(lst_shifted)