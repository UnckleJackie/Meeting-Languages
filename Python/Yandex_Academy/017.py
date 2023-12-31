amount_dec = int(input())
sum_last = str(input())
sum_last_bin = str("0b" + sum_last)

sum_last_int = int(sum_last_bin, 2)
amount_day = sum_last_int + amount_dec
print(amount_day)