# def sum_numbers(n):
#     sum = 0
#     for i in range(1, n + 1):
#         sum += i
#     print(sum)
# n = int(input('Enter the number: '))
# sum_numbers(n)

def sum_numbers(n, y = 'Hello'):
    print(y)
    sum = 0
    for i in range(1, n + 1):
        sum += i
    return(sum)
    print('stop') # Не воспринимает эту строку, т.к. уже возвращено значение
n = int(input('Enter the number: '))
print(sum_numbers(n))
a = sum_numbers(n)
print(a)
