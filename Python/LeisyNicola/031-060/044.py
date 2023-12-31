count_guests = int(input('Enter the count of guests: '))
if count_guests > 10:
    print('It\'s too expensive for us, homie! Kiss my ass!')
else:
    for i in range(1, count_guests + 1):
        guest_name = input('Enter the guest\'s name: ')
        print(f'{guest_name} has been invited')
    print('Everybody should their money ready!')