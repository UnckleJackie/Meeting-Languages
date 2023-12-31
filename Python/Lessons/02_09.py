# Замороженные множества
a = {1, 8, 6}
b = frozenset(a)
print(b)

# Задача: Создать список, состоящий из четных чисел от 1 до 100
list_1 = []
for i in range(1, 101):
    list_1.append(i)
print('program in 3 strings: ', list_1)

list_1 = [i for i in range(1, 101)]
print('programm in 1 string: ', list_1)

list_1 = [i for i in range(1, 101) if not i %2]
print('program in 1 string "even numbers": ', list_1)

list_1 = [(i, i) for i in range(1, 101) if not i % 2]
print('Создадим пары каждому из чисел (кортежи): ', list_1)

list_1 = [i * 2 for i in range(10) if not i % 2]
print('Умножим значения на 2: ', list_1)