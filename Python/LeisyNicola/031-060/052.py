import random
num1 = random.random()
print(num1)

num2 = 3
for i in range(num2):
    num = random.randint(0, 101)
    print(num, end = ' ')
print()

num3 = random.randint(0,30)
num4 = random.randint(0,30)
while num4 != num3:
    num4 = random.randint(0, 30)
    print(num4, end = ' ')
print()
print('!!!num4 = num3!!!')
colour = random.choice(['red', 'black', 'green'])
print(colour)