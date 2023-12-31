is_authorized = True
print(is_authorized)  # True
print(type(is_authorized))  # <class 'bool'>
print(100 > 24)  # True
print(-5 > 0)  # False
print('Long string' > 'Long')  # True
print([1, 2, 3] == [1, 2, 3])  # True

my_value = 500
print(bool(my_value))

db_is_available = False
print((db_is_available))
print(f'Type of db_is_available is: {type(db_is_available)}')
db_is_available = True
print(f'So, now the db_is_available is: {db_is_available}')

print(bool(10))
print(bool('abc'))
print(bool([]))
print(bool([1, 2]))
print(bool(None))

print(100 > 10)
print('Long string' > 'Short')
print([] == [])
print({'a': 3} == {'a': 3})
