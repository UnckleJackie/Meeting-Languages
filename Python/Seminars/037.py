# Дано натуральное число N и
# последовательность из N элементов.
# Требуется вывести эту последовательность в
# обратном порядке.
# Примечание. В программе запрещается
# объявлять массивы и использовать циклы
# (даже для ввода и вывода).
# Input: 2 -> 3 4
# Output: 4 3

def rec_input(num: int):
    if num == 0:
        return
    s = input('Enter the number: ')
    return rec_input(num - 1)
print(rec_input(5))


#print(*str(12345)[::-1])