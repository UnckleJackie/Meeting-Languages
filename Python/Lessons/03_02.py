def sum_str(*args):  # unbounded arguments amount
    res = ''
    for i in args:
        res += i
    return res
print(sum_str('q', 'e', 'i'))
print(sum_str('q', 'e', 'i', 'r', 'f'))
print(sum_str('1', '8', '9', 'i'))