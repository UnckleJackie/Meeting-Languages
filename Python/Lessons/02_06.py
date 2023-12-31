d = {}
d = dict()

d['q'] = 'qwerty'
print(d)
d['w'] = 'werty'
print(d['w'])

dictionary = {}
dictionary = {'up': '↑', 'left': '←', 'down': '↓', 'right': '→'}
print(dictionary)
print(dictionary['left'])
print(dictionary['up'])
dictionary['left'] = '◄'
print(dictionary['left'])
# print(dictionary['type'])
del dictionary['left']
for item in dictionary:
    print('{}: {}'.format(item, dictionary[item]))
dictionary[895] = 98998
print(dictionary)
print(dictionary.items())

for (k, v) in dictionary.items():
    print(k, v)