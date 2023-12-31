import math

choice_user1 = '1) Square'
choice_user2 = '2) Triangle'
print(f'{choice_user1}\n{choice_user2}')
user_input = int(input('Enter 1 or 2: '))
if user_input == 1:
    size = int(input('Enter the size of quad: '))
    square = size ** 2
    print(f'Square of the quad is {square}')
elif user_input == 2:
    size = int(input('Enter the size of triangle: '))
    height = int(input('Enter the height of the triangle: '))
    square = size * height * 0.5
    print(f'Square of the triangle is {square}')
else:
    print('Incorrect data')
      