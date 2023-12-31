import random
colours = (['red', 'blue', 'black', 'white', 'green', 'brown'])
my_colour = random.choice(colours)
print(my_colour)
user_colour = random.choice(colours)
print(user_colour)
if user_colour == my_colour:
    print('Well done!')
else:
    while user_colour != my_colour:
        user_colour = random.choice(colours)
        print(user_colour)
        if my_colour == 'red':
            print('Prompt RED')
        elif my_colour == 'blue':
            print('Prompt BLUE')
        elif my_colour == 'black':
            print('Prompt BLACK')
        elif my_colour == 'white':
            print('Prompt BLACK')
        elif my_colour == 'green':
            print('Prompt WHITE')
        elif my_colour == 'brown':
            print('Prompt BROWN')