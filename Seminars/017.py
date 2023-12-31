# Дан список чисел. Определите, сколько в нем
# встречается различных чисел.
# Input: [1, 1, 2, 0, -1, 3, 4, 4]
# Output: 6

# list_a = []

# for _ in range(5):
#     list_a.append(int(input()))

# a = input().split(',')
# print(a)
# print(type(a))
# for i in range(len(a)):
#     a[i] = int(a[i])
# print(a)

# lst = [1, 1, 2, 0, -1, 3, 4, 4]
# lst1 = set(lst)
# print(lst1)

lst = [1, 1, 2, 0, -1, 3, 4, 4]
lst1 = []
for i in lst:
    if i not in lst1:
        lst1.append(i)
print(len(lst1), '\n', lst1)
