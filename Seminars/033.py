# Хакер Василий получил доступ к классному журналу и
# хочет заменить все свои минимальные оценки на
# максимальные. Напишите программу, которая
# заменяет оценки Василия, но наоборот: все
# максимальные – на минимальные.
# Input: 5 -> 1 3 3 3 4
# Output: 1 3 3 3 1

def change_journal(lst):
    maximum = 0
    minimum = float('inf')
    for i in lst:
        if maximum < i:
            maximum = i
        if minimum > i:
            minimum = i
    print(maximum, minimum)
    for i in range(len(lst)):
        if lst[i] == maximum:
            lst[i] = minimum
    print(lst)
    
journal = [1, 3, 5, 3, 3, 4]
change_journal(journal)


# lst = [2, 2, 2, 2, 2]
# def change():
#     lst[2] = 5
# change()
# print(lst)
        
# lst = 7
# lst = 'asfs'
# def change(a: int, b: int):
#     return a + b
