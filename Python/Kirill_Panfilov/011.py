from copy import deepcopy

a = [1, 2, [3, 4]]
b = deepcopy(a)
print(a)
print(b)

a.append(4)
print(a == b)
print(a is b)
print(a)
print(b)
a[2][1] = 'AAAA'
b.append('Я сильная и независимая')
print(a)
print(b)
print(id(a[0]))
print(id(b[0]))

matrix = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
print(matrix)