first_name_user = input('Enter your name: ')
num_user = int(input('Enter the number: '))
first_name_user = first_name_user.capitalize()

for i in range(num_user):
    if i < 10:
        print(f'0{i} - {first_name_user}_0{i}')
    else:
        print(f'{i} - {first_name_user}_{i}')
        