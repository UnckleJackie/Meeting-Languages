a = float(input("Введите первое число: "))  # Считывается первое число
b = float(input("Введите второе число: "))  # Считывается второе число
value_1 = "Первое число больше второго!"  # Первое значение
value_2 = "Второе число не меньше первого!"  # Второе значение
res = value_1 if a > b else value_2  # Вызывается тернарный оператор
print(res)          # Отображается результат