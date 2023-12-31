# Напишите функцию, которая принимает одно число и
# проверяет, является ли оно простым
# Напоминание: Простое число - это число, которое
# имеет 2 делителя: 1 и n(само число)
# Input: 5
# Output: yes

# a = int(input('Enter the number: '))
# k = 0
# for i in range(2, a // 2 + 1):
#     if (a % i == 0):
#         k = k + 1
#     if (k <= 0):
#         print('The number is simple')
#     else:
#         print('The number is not simple')

# def prime_number(number):
#     if number in (1, 2):
#         return True
#     if not number % 2:
#         return False
#     for i in range(3, int(number ** 0.5), 2):
#         if not number % i:
#             return False
#     return True
# print(prime_number(int(input('Enter the number: '))))


def is_prime(number: int) -> bool:
    if number <= 3:
        return True
    if number % 2 == 0:
        return False
    for i in range(3, int(number ** 0.5), 2):
        if number % i == 0:
            return False
    return True
print(is_prime(170141183460469231731687303715884105727)) #4105727