name_user = input('Enter your name: ')
count = 0
name_user = name_user.lower()
for letter in name_user:
    if letter == 'a' or letter == 'e' or letter == 'u' or letter == 'i' or letter == 'o':
        count += 1
print('Vowels in your name: ', count)