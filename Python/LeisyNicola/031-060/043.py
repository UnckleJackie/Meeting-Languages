count_user = input('What kind of counting do you prefer? Direct or Back: ')
count_user = count_user.lower()
num_user = int(input('Enter the number: '))

if count_user == 'direct':
    for i in range(1, num_user + 1):
        print(i, end = ' ')
elif count_user == 'back':
    num_user2 = int(input('Till which number count down: '))
    if num_user2 < num_user:
        for i in range(num_user, num_user2 - 1, -1):
            print(i, end = ' ')
    else:
        print('That\'s impossible, chap!')
else:
    print("I don\'t understand")