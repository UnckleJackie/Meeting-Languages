

a = 4
b = a
c = 3

print(type(a))
print(type(b))
print(type(c))
print(id(a))
print(id(b))
print(id(c))

c += 1

print(id(c))
print(c is a is b)