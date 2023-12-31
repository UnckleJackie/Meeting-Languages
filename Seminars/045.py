'''Два различных натуральных числа n и m называются
дружественными, если сумма делителей числа n
(включая 1, но исключая само n) равна числу m и
наоборот. Например, 220 и 284 – дружественные числа.
По данному числу k выведите все пары дружественных
чисел, каждое из которых не превосходит k. Программа
получает на вход одно натуральное число k, не
превосходящее 105. Программа должна вывести все
пары дружественных чисел, каждое из которых не
превосходит k. Пары необходимо выводить по одной в
строке, разделяя пробелами. Каждая пара должна быть
выведена только один раз (перестановка чисел новую
пару не дает).
Ввод: Вывод:
300 220 284'''

def sum_of_divisors(num: int) -> int:
    summ = {1}
    for div in range(2, int(num ** 0.5) + 1):
        if not num % div:
            summ.add(div)
            summ.add(num // div)
    return sum(summ)

friendly_dict = {i: sum_of_divisors(i) for i in range(1, 1000000)}

for number, summ in friendly_dict.items():
    if number == friendly_dict.get(summ) and number < summ:
        print(number, summ)

# def sum_dividers(number: int):
#     dividers = set()
#     dividers.add(1)
#     for i in range(2, int(number ** 0.5) +1):
#         if not number % i:
#             dividers.add(i)
#             dividers.add(number // i)
#     return sum(dividers)


# def find_friendly(max_number: int):
#     for i in range(1, max_number + 1):
#         var = sum_dividers(i)
#         if var <= max_number:
#             if sum_dividers(var) == i:
#                 print(1, var)
            
# find_friendly(10000)

# for i in range(1, 9999):
#     for k in range(1, i // 2 + 1):
#         if i % k == 0:
#             sum1 += k
#     for j in range(i + 1, 9999):
#         if j == i:
#             continue
#         for k in range(1, j // 2 + 1):
#             if j % k == 0:
#                 sum2 += k
#         if sum1 == j and sum2 == i:
#             print(i, j, sep = ' ')
#     sum1, sum2 = 0, 0

# def getSum(value):
#     res = 1
#     for i in range(2, int(value**0.5) + 1):
#         if value % i == 0:
#             res += i + value // i
#         count += 1
#     return res

# for i in range(10, 250000):
#     sum1 = getSum(i)
#     sum2 = getSum(sum1)
#     if sum2 == i and sum1 != sum2:
#         print(i, sum1)

# def sum_dividers(number: int):
#     dividers = set()
#     dividers.add(1)
#     for i in range(2, int(number ** 0.5) + 1):
#         if not number % i:
#             dividers.add(i)
#             dividers.add(number // i)

#     return sum(dividers)


# def find_friendly(max_number: int):
#     for i in range(1, max_number + 1):
#         var = sum_dividers(i)
#         if var <= max_number:
#             if sum_dividers(var) == i:
#                 if i < var:
#                     print(i, var)


# find_friendly(9_999_999)

