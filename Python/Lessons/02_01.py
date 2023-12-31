list_1 = []
list_1 = list()
list_1 = [1, 2, 3, 8]
print(f'list_1: {list_1}')
print(f'list_1: ', *list_1)  # Вывод через пробел и без квадратных скобочек

for i in list_1:
    print(i, end = ' ')
    i += 1
print(f'\nlen(list_1): {len(list_1)}')

print(f'list_1[3]: {list_1[3]}')