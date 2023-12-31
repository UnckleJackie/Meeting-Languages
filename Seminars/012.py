# Петя и Катя – брат и сестра. Петя – студент, а Катя – школьница. 
# Петя помогает Кате по математике. Он задумывает два
# натуральных числа X и Y (X,Y≤1000), а Катя должна их отгадать. Для
# этого Петя делает две подсказки. Он называет сумму этих чисел S и их
# произведение P. Помогите Кате отгадать задуманные Петей числа
from math import sqrt

sum = int(input('Enter the sum of numbers: '))
multiplie = int(input('Enter the multiplie of numbers: '))

num_1 = (sum - int(sqrt(sum ** 2 - 4 * multiplie))) // 2
# D = sum ** 2 - 4 * multiplie
# print(D)
num_2 = (sum + int(sqrt(sum ** 2 - 4 * multiplie))) // 2

print(num_1, num_2)