# n = int(input('Enter the number: '))
# a = range(n + 1)
# a[1] = 0
# lst = []

# i = 2
# while i <= n:
#     if a[i] != 0:
#         lst.append(a[i])
#         for j in range(i, n + 1, i):
#             a[j] = 0
#     i += 1
# print(lst)

n = int(input('n = '))
lst = [2]
for i in range(3, n + 1, 2):
    if (i > 10) and (i % 10 == 5):
        continue
    for j in lst:
        if j * j - 1 > i:
            lst.append(i)
            break
        if(i % j == 0):
            break
    else:
        lst.append(i)
print(lst[-1])