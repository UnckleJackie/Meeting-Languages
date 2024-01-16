guest_list = []
for i in range(3):
    guest_list.append(input('Enter the guest\'s name: '))
print(guest_list)
answer_user = input('Do you want to add anybody else? (y/n): ')
answer_user = answer_user.lower()
while answer_user == 'y':
    guest_list.append(input('Enter the name: '))
    answer_user = input('Next? (y/n): ')
print(guest_list)

choice_user = input('Choose the name from the list: ')
choice_index = guest_list.index(choice_user)
print(choice_index)
choose_guest = input('Do you want to see the guest? (y/n): ')
if choose_guest == 'n':
    del guest_list[choice_index]
    print(f'The guest {choice_user} deleted')
print(guest_list)
