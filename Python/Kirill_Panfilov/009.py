

m = 0
# while True:
#     n += 1
#     print('Huilow')
#     if n > 10:
#         print('Zaipalsa')
#         break

# while m <= 10:
#     n = 0
#     while n <= 10:
#         n += 1
#         if n % 2:
#             continue
#         if n == m:
#             print('n == m')
#             break
#         else:
#             print('Huilow', n, m)
#     m += 1
# print('Zaipalsa')

flag = True
while m <= 10 and flag:
    n = 0
    while n <= 10 and flag:
        n += 1
        if n % 2:
            continue
        if n == m:
            print('n == m')
            flag = False
        else:
            print('Huilow', n, m)
    m += 1
print('Zaipalsa')