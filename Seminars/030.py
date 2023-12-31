'''Задача 30: Заполните массив элементами арифметической прогрессии. 
Её первый элемент, разность и количество
элементов нужно ввести с клавиатуры. 
Формула для получения n-го члена прогрессии: an = a1 + (n-1) * d.
Каждое число вводится с новой строки.
Ввод: 7 2 5
Вывод: 7 9 11 13 15'''

first_num = int(input('Enter the beginning of progression: '))
interval_num = int(input('Enter interval: '))
end_num = int(input('Enter end number progression: '))
for i in range(end_num):
    print(first_num + interval_num * i, end = ' ')