# Последовательностью Фибоначчи называется последовательность чисел 
# a0, a1, ..., an, ..., гдеa0 = 0, a1 = 1, ak = ak-1 + ak-2 (k > 1).
# Требуется найти N-е число Фибоначчи
# Input: 7
# Output: 13
# Задание необходимо решать через рекурсию

# fib_1 = fib_2 = 1
# fib_index = int(input("Enter the FIBO index: "))
# i = 0

# while i < fib_index - 2:
#     fib_sum = fib_1 + fib_2
#     fib_1 = fib_2
#     fib_2 = fib_sum
#     i += 1
# print(f"The number of your FIBO index is: {fib_2}")

# fib_1 = fib_2 = 1
# fib_index = int(input('Enter the FIBO index: ')) - 2

# while fib_index > 0:
#     fib_1, fib_2 = fib_2, fib_1 + fib_2
#     fib_index -= 1
# print(f'The number of your FIBO index is: {fib_2}')

# fib_1 = fib_2 = 1
# fib_index = int(input('Enter the FIBO index: '))
# #print(fib_1, fib_2, end = ' ')

# for i in range(2, fib_index):
#     fib_1, fib_2 = fib_2, fib_1 + fib_2
# print(fib_2, end = ' ')  # max index = 20577

def fibonacci(n):
    if n in (1, 2):
        return 1
    return fibonacci(n - 1) + fibonacci(n - 2)
fib_index = int(input('Enter the FIBO index: '))
print(fibonacci(fib_index))
