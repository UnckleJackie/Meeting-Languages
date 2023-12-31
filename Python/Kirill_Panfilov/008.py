
number = 10
print(number % 2 == 0)
print(100 + (number % 2 == 0))

print('not' * (number % 2 != 0) + 'even')

print(bool(''))
print(bool(0))
print(bool([]))
print(bool({}))
print(bool(tuple()))
print(bool(None))
print(bool(set()))
print(bool(number))

if number:
    print(100 / number)