food_dictionary = {}
for i in range(5):
    food = input('Enter the food you like: ')
    food_dictionary[i] = food
print(food_dictionary)

dislike = int(input('Enter the food you want to delete: '))
del food_dictionary[dislike]
print(food_dictionary)
