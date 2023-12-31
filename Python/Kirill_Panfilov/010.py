

lst = ['a', 'b', 'c', 'd']
for i in range(len(lst)):
    if lst[i] == 'c':
        lst[i] = 'C'

print(lst)

for i in range(len(lst)):
    if lst[i] == 'd':
        lst.remove('d')

print(lst)

b = [2, '5', True, 8.908, '@sutula', False]
for item in b:
    print(item)