import random

fruit_tuple = ('apricot', 'orange', 'watermelon', 'banana', 'pomegranate', 'pear', 'melon',
               'kiwi', 'mango', 'tangerine', 'peach', 'plum', 'persimmon', 'apple', 'strawberry')
country_tuple = ('Russia', 'China', 'USA', 'India', 'Thailand', 'Sri-Lanka')

milky_products_list = (['yoghurt', 'mayonnaise', 'milk', 'cream', 'cheese', 'kefir', 'sour cream'])
investors_list = ['Diana', 'Yana Poluyana', 'Minaeva Lidia', 'Ostapenko Natalia', 'Zebnitsky Andrey',
                  'Artyom', 'Anatoly', 'Terehova Natalia', 'Tatyana Borisovna', 'Oksana']

consumption = {1: 'omega-3', 2: 'Vitamin D', 3: 'Vitamin C', 4: 'Collagen', 5: 'Vitamin Complex', 
               6: 'Glycine', 7: 'Curcumin Turmeric', 8: 'Nattokinase', 9: 'Chromium Picolinate', 10: 'Gingko Biloba'}

print(milky_products_list)
product = random.choice(fruit_tuple)
print(product)