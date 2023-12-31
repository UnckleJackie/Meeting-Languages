name = input()
price_name = int(input())
weight = int(input())
money = int(input())

count = price_name * weight
money_back = money - count

print(str("=" * 16 + "Чек" + "=" * 16))
print(f"Товар:{name:>29}")
s = str(weight) + "кг" + " * " + str(price_name)+ "руб/кг"
print("Цена:" + " " * (35 - 5 - len(s)) + s)
print(f"Итого:{count:>26}руб")
print(f"Внесено:{money:>24}руб")
print(f"Сдача:{money_back:26}руб")
print(str("=" * 35))