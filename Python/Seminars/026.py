# Напишите программу, которая на вход принимает два числа A и B, 
# и возводит число А в целую степень B с помощью рекурсии.
# A = 3; B = 5 -> 243 (3⁵)
# A = 2; B = 3 -> 8

def rec_power(num_1, num_2):
    if num_2 == 0:
        return 1
    return num_1 * rec_power(num_1, num_2 - 1)

num_1 = int(input('Enter A: '))
num_2 = int(input('Enter power: '))
print(rec_power(num_1, num_2))