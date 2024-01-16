number_list = ([354, 745, 238, 289])
for i in number_list:
    print(i)
number_user = int(input('Enter the 3-digits number: '))
if number_user in number_list:
    print(number_list.index(number_user))
else:
    print('That is not in the list')