def sum_nums(a, b):
    sum = a + b
    # print(sum)
    return(sum)


def multiplie_nums(a, b):
    multiplie = sum_nums(a, b) * a * b
    return multiplie

print(sum_nums(10, 5))
print(sum_nums(sum_nums(28, 6), sum_nums(18, 3)))
print(multiplie_nums(18, 9))

number_1 = multiplie_nums(16, 6) + sum_nums(sum_nums(15, 8), sum_nums(35, 8))
print(number_1)