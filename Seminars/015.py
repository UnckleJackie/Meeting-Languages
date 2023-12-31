# Иван Васильевич пришел на рынок и решил купить два арбуза: 
# один для себя, а другой для тещи. Понятно, что для себя нужно выбрать арбуз
# потяжелей, а для тещи полегче. Но вот незадача: арбузов слишком много и 
# он не знает как же выбрать самый легкий и самый тяжелый арбуз? Помогите ему!
# Пользователь вводит одно число N – количество арбузов. 
# Вторая строка содержит N чисел, записанных на новой строчке каждое. 
# Здесь каждое число – это масса соответствующего арбуза
# Input: 5 -> 5 1 6 5 9
# Output: 1 9
import random
amount_watermelons = int(input('Enter the amount of watermelons: '))
watermelon_min, watermelon_max, count = 30, 0, 0
for _ in range(amount_watermelons):
    weight_watermelon = random.randint(1, 300)
    if weight_watermelon > watermelon_max:
        watermelon_max = weight_watermelon
    if weight_watermelon < watermelon_min:
        watermelon_min = weight_watermelon
    # print(weight_watermelon, end = ' ')
print(f'\nmax = {watermelon_max}, min = {watermelon_min}')