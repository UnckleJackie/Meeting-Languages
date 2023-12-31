age_user = int(input('How old are you, chap?: '))
if age_user >= 18:
    print('You can vote')
elif age_user == 17:
    print('You can learn to drive')
elif age_user == 16:
    print('You can buy a lottery ticket')
else:
    print('You can go Trick-or-Treating')