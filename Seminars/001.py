# За день машина проезжает п километров. 
# Сколько дней нужно, чтобы проехать маршрут длиной m километров?
# При решении этой задачи нельзя пользоваться условиями и циклами

# import math
# n = int(input("Введите кол-во километров, которое проезжает за день авто: "))
# m = int(input("Введите кол-во километров пути: "))
# days = math.ceil(m / n)
# print("Количество дней в пути: ", days)

# per_day = int(input("km per day: "))
# total = int(input("total kilometers: "))
# days = (total + per_day - 1) // per_day
# print(days)

# import math
# per_day = int(input("km per day: "))
# total = int(input("total kilometers: "))
# days = total / per_day
# print(round(days))
# print(math.floor(days))  # - round to less
# print(math.ceil(days))  # - round to more

import math
per_day = int(input("km per day: "))
total = int(input("total kilometers: "))
days = total // per_day + bool(total % per_day != 0)
print(days)