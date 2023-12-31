# Уставшие от необычно теплой зимы, жители решили узнать,действительно ли это самая 
# длинная оттепель за всю историю наблюдений за погодой. Они обратились к синоптикам, 
# а те, всвою очередь, занялись исследованиями статистики запрошлые годы. 
# Их интересует, сколько дней длилась самая длинная оттепель. Оттепелью они называют 
# период, в который среднесуточная температура ежедневно превышала 0 градусов Цельсия. 
# Напишите программу, помогающую синоптикам в работе.
# Пользователь вводит число N – общее количество рассматриваемых дней (1 ≤ N ≤ 100). 
# В следующих строках располагается N целых чисел.
# Каждое число – среднесуточная температура в соответствующий день. 
# Температуры – целые числа и лежат в диапазоне от –50 до 50
# Input: 6 -> -20 30 -40 50 10 -10
# Output: 2
import random
# random.randint()
# days_amount = int(input('Enter the amount of days: '))
# i = 0
# count = 0
# count_max = 0
# while i < days_amount:
#     day_temperature = random.randint(-50, 50)
#     print(day_temperature)
#     if day_temperature > 0:
#         count += 1
#         if count > count_max:
#             count_max = count
#     elif day_temperature < 0:
#         count = 0
#     i += 1

# print(f'Max sequence of warm days: {count_max}')

temps = [random.randint(-50, 50) for i in range(int(input("Enter the amount of days: ")))]
max, count = 0, 0

for day in temps:
    if day > 0:
        count += 1
    else:
        if max < count:
            max = count
        count = 0

if max < count:
    max = count
print(f'{temps}\nMax wequence of warm days: {max}')
