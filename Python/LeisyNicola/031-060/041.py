first_name_user = input('Enter your first name: ')
num_user = int(input('Enter the number: '))
if num_user < 10:
    for i in range(num_user):
        print(first_name_user, end = ' ')
else:
    for i in range(3):
        print('Too high')