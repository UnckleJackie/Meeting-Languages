count = 5
while count > 0:
    print(f'''There are {count} green bottles hanging on the wall, 
{count} green bottles hanging on the wall. and if 1 green bottle should accidentally fall''')
    count -= 1
    answer_user = int(input('How many green bottles will be hanging on the wall?: '))
    if answer_user == count:
        print(f'There will be {count} green bottles hanging on the wall.')
    else: 
        while answer_user != count:
            answer_user = int(input('No, try again: '))
print('There no more green bottles hanging on the wall!')