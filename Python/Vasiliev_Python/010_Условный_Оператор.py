res = eval(input("Введите что-нибудь: "))  # Пользователь вводит значение
if type(res) == int:  # Используем условный оператор для проверки типа введенного пользователем значения
    print("Вы ввели целое число!")  # Если целое число
else:           # Если что-то другое
    print("Это точно не целое число!")
print("Работа завершена!")  # После выполнения условного оператора

# Если вводим текст, то обязательно в КАВЫЧКАХ!