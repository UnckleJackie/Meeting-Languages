# good = input("Название товара: ")
# height = int(input("вес: "))
# price = int(input("цена: "))
# money = int(input("Внесено: "))
# amount = height * price
# money_back = money - amount

# print("Чек")
# print(f"{good} - {height}кг - {price}руб/кг")
# print(f"Итого: {amount}руб")
# print(f"Внесено: {money}руб")
# print(f"Сдача: {money_back}руб")

name = input()
price = int(input())
weight = int(input())
money = int(input())
print("Чек")
print(name, "-", str(weight) + "кг -", str(price) + "руб/кг")
print("Итого:", str(weight * price) + "руб")
print("Внесено:", str(money) + "руб")
print("Сдача:", str(money - weight * price) + "руб")