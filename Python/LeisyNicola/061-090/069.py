import random
#import lists

fruit_tuple = ('apricot', 'orange', 'watermelon', 'banana', 'pomegranate', 'pear', 'melon',
               'kiwi', 'mango', 'tangerine', 'peach', 'plum', 'persimmon', 'apple', 'strawberry')
print(fruit_tuple.index('strawberry'))
print(fruit_tuple[2])
print(fruit_tuple[3])
print(fruit_tuple[2:5])

investors_list = ['Diana', 'Yana Poluyana', 'Minaeva Lidia', 'Ostapenko Natalia', 'Zebnitsky Andrey',
                  'Artyom', 'Anatoly', 'Terehova Natalia', 'Tatyana Borisovna', 'Oksana']
# investors_list.append(input('Add a name: '))
print(investors_list)
# print(sorted(investors_list))
del investors_list[3]
print(investors_list)
investors_list.sort()
print(investors_list)

consumption = {1: 'omega-3', 2: 'Vitamin D', 3: 'Vitamin C', 4: 'Collagen', 5: 'Vitamin Complex', 
               6: 'Glycine', 7: 'Curcumin Turmeric', 8: 'Nattokinase', 9: 'Chromium Picolinate', 10: 'Gingko Biloba'}
print(consumption)

x = [154, 634, 892, 345, 341, 43]
print(len(x))
print(x[1:4])

for i in x:
    print(i, end = '|')

num = 0
while num not in x:
    num = random.randint(340, 346)
    print(f'{num} not in the list')
print(f'{num} in the list')

x.insert(2, 420)
x.remove(892)
x.append(993)
print(x)

country_tuple = ('Russia', 'China', 'USA', 'India', 'Thailand', 'Sri-Lanka')
print(country_tuple)
answer_user = input('Enter the country: ')
print(f'{answer_user} has index number {country_tuple.index(answer_user)}')

