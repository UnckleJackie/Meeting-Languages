price = input()
money = int(input())

price_bin = str("0b" + price)
price_dec = int(price_bin, 2)
money_back = money - price_dec

print(money_back)