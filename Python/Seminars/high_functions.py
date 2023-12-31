# a = '123456789'
# a = list(a)
# print(list(a))

# for i in range(len(a)):
#     a[i] = int(a[i])

# print(a)

# #  через функцию map
# a = '123456789'
# a = list(map(int, a))
# print(a)

# filter
# a = '123456789'
# a = list(a)
# a = list(map(int, a))
# b = []
# for item in a:
#     if item % 2 == 0:
#         b.append(item)
# print(b)

# # using filter
# a = '123456789'
# a = list(a)
# a = list(map(int, a))

# lambda
# def func(x):
#     return x ** 2

# lambda x: x ** 2

# a = '123456789'
# a = list(a)
# print(a)

# a = [int(x) for x in a if (int(x) % 2 == 0, a)]
# print(a)
# a = list(map(lambda x: x * 2, a))
# print(a)
# a = list(map(lambda x: int(x) * 2, a))
# print(a)
# a = list(map(lambda x: x.isdigit(x), a))

# print(a)
# b = []
# a = list(map(lambda x: int(x) % 2 == 0, a))
# print(a)

# enumerate
# a = 'abcdefgh'
# a = list(a)
# print(a)
# for i in range(len(a)):
#     print(i, end = ' ')
# print()

# for i, item in enumerate(a):
#     print(i, item, end = ' ')

# zip
a = 'abcdefgh'
b = '12345678'
a = list(a)
print(a)
c = []
for i in range(len(a)):
    c.append((a[i], b[i]))
print(c)

a = 'abcdefgh'
b = '12345678'
a = list(a)
print(a)
c = list(zip(a, b))
print(c)