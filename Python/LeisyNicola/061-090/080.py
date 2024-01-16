msg = 'Jackson Mississippi'
if msg.isupper():
    print('Uppercase')
elif msg.islower():
    print('Lowercase')
else:
    print('This is not uppercase')

for letter in msg:
    print(letter, end = '*')

name_user = input('Enter your name: ')
length_name_user = len(name_user)
print(length_name_user)
last_name_user = input('Enter your last name: ')
length_last_name_user = len(last_name_user)
print(length_last_name_user)

full_name_user = name_user + ' ' + last_name_user
print(full_name_user)
length_full_name_user = len(full_name_user)
print(length_full_name_user)
