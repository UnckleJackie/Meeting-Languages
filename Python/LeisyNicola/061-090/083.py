word_user = input('Enter the word in uppercase: ')
tryagain = False
while tryagain == False:
    if word_user.isupper():
        print('Thenk you!')
        tryagain = True
    else:
        print('Try again')
        word_user = input('Enter the word in uppercase: ')
print('Good bye!')