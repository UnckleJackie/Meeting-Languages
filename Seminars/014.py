#  Требуется вывести все целые степени двойки 
# (т.е. числа вида 2k), не превосходящие числа N

number = int(input('Enter the number: '))
i = 0
while 2 ** i <= number:
    print(2 ** i, end = ' ')
    i += 1