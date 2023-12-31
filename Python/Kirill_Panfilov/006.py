
# try:
#     number = int(input('Enterthe number: '))
# except:
#     print('You entered not a number!')

# number = input('Enter the number: ')
# if 0 < int(number) < 10 and number.isdigit():  # letters to int -> Error
#     print('You entered the number from 1 to 10')

# number = input('Enter the number: ')
# if number.isdigit() and - 0 < int(number) < 10:  # lazy if - without the error
#     print('You entered the number from 1 to 10')

number = input('Enter the number: ')
if number.isdigit() and int(number) != 0:
    print(100 / int(number))