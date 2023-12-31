color = input()
match color:
    case 'red' | 'yellow':
        print('Stop!')
    case 'green':
        print('You can go!')
    case _:
        print('Incorrect input')