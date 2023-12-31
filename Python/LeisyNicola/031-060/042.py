total = 0
for i in range(5):
    num_user = int(input(f'Enter the {i+1}th number: '))
    answer_user = input('Add to total this number? (Yes / No): ')
    answer_user = answer_user.lower()
    if answer_user == 'yes':
        total += num_user
    elif answer_user == 'no':
        continue
print(total)