guest_list = []
for i in range(3):
    guest_list.append(input('Enter the guest\'s name: '))
print(guest_list)
another = input('Do you want to see anybody else? (y/n): ')
while another == 'y':
    guest_list.append(input('Enter another guest: '))
    another = input('Anybody else? (y/n): ')
print(f'You have {len(guest_list)} guests: {guest_list}')