list_1 = [1, 5]
print(list_1)
list_1.append(8)
print(list_1)
list_1.append(85)
print(list_1)

for i in range(5):
    list_1.append(i)
    i += 1
print(list_1)

# Удаление последнего элемента из списка
print(list_1.pop())  # 4
print(list_1)  
print(list_1.pop())  # 3
print(list_1)
print(list_1.pop())  # 2
print(list_1)

# Удаление конкретного элемента из списка
list_1 = [12, 7, -1, 21, 0]
print(list_1.pop(0))  # 12
print(list_1)

# Добавление элемента на нужную позицию
list_1.append(0)
print(list_1)
print(list_1.insert(2, 11))
print(list_1)