answer_user = str.lower(input('Is it rainy today?: '))
if answer_user == 'yes':
    answer_user2 = str.lower(input('Is it windy today?: '))
    if answer_user2 == 'yes':
        print('It is too windy for an umbrella')
    else:
        print('Take an umbrella')
else:
    print('Enjoy your day!')
