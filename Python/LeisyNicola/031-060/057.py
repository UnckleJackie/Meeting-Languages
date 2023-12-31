import random
begin_range = 1
end_range = 31
num_my = random.randint(begin_range, end_range + 1)
print(f'My number is {num_my}')
num_user = random.randint(begin_range, end_range + 1)

while num_user != num_my:
    if num_user < num_my:
        print('Your number is less than mine!')
    else:
        print('Your number is more than mine!')
    num_user = random.randint(begin_range, end_range + 1)
    print(num_user, end = ' ')
print('Got it!!! Your number is', num_user)


