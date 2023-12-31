t = ()

print(type(t))

t = (1)
print(type(t))
t = (1, )
print(type(t))
t = (1, 2, 3, 4, 5)
print(type(t))
t = (1, 2, 3, 4, 5, )
print(type(t))

v = [1, 8, 9, 4]
print(type(v))

v = tuple(v)
print(type(v))
print(v)

a, b, c, d = v
print(a, b, c, d)