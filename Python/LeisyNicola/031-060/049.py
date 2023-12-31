compnum = 50
num_user = int(input('Enter the number: '))
attempt = 1
while num_user != compnum:
    if num_user > compnum:
        print('Your number is MORE')
    elif num_user < compnum:
        print('Your number is LESS')
    num_user = int(input('Enter the number: '))
    attempt += 1
print(f'Well done! You took {attempt} attempts')
