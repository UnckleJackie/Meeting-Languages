num_user1 = int(input('Enter the first number: '))
num_user2 = int(input('Enter the second number: '))
total = num_user1 + num_user2
answer_user = input('If you want to enter one more number, print "y": ')
answer_user = answer_user.lower()
while answer_user == 'y':
    num_user = int(input('Enter the number: '))
    total += num_user
    answer_user = input('Go on?: ')
print(total)