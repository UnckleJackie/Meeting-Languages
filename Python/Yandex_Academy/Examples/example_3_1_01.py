text = input('Enter the string: ')
print(text[0])

i = int(input('Enter the symbol index: '))
if i < len(text):
    print(text[i])
else:
    print('Index is out of range!')

print(text[-1])

for i in range(len(text)):
    print(text[i], end = ' ')
print()

for letter in text:
    print(letter, end = '|')
print()

for i, letter in enumerate(text):
    print(f'{i}. {letter}', end = '|')
print()

print(text[8:11])
print(text[:6])
print(text[8:])
print(text[:])
print(text[::2])