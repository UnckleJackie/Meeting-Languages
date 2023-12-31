import random
num_my = random.randint(1, 11)
print(num_my)
num_user = random.randint(1, 11)
while num_user != num_my:
    num_user = random.randint(1, 11)
    print(num_user, end = ' ')
print('Jesus! I thaught I will asleep!')
