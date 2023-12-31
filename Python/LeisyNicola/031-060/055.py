import random
num_my = random.randint(1, 6)
print(f'My number is {num_my}')
num_user = random.randint(1, 6)
if num_user == num_my:
    print('Well done')
else:
    print('My number more or less than yours')
    num_user = random.randint(1, 6)
    if num_user == num_my:
        print('Correct')
    else:
        print('You lose')