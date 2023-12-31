num_user = int(input('Enter the number from 10 till 20: '))
while num_user < 10 or num_user > 20:
    if num_user < 10:
        print('Too low!')
    elif num_user > 20:
        print('Too high!')
    num_user = int(input('Try again: '))
print('Thank you!')
