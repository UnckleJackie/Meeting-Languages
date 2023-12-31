n = int(input())
r = range(n, n + 1000)
flag = True
i = 2
while flag:
    if n % i == 0:  # if remain from division n to i is 0
        flag = False
        print(i)
    elif i > n // 2:  # divider of number can't be more than input divided to 2 number
        print(n)
        flag = False
    i += 1