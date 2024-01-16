program_list = ['Breaking bad', 'Suits', 'Narcos', 'Mr.Between']
for item in program_list:
    print(item)
program_user = input('Enter the name of program: ')
program_position = int(input('Enter the number of position in list: '))
program_list.insert(program_position, program_user)
print(program_list)
