import random
coin = (['h', 't'])
my_choice = random.choice(coin)
print(my_choice)
user_choice = random.choice(coin)
# while user_choice != my_choice:
#     print('Bad luck! Try again!')
#     user_choice = random.choice(coin)
# print('You win!')

if user_choice == my_choice:
    print('You win, baby!')
else:
    print('Bad luck')