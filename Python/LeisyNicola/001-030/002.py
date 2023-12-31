first_name_user = input("Enter your name, please: ")
last_name_user = input("So, now enter your last name: ")
print(f'Hello, {last_name_user} {first_name_user}! I was waiting for you!\n'
      f'What do you call a bear with no teeth?\n'
      f'A gummy bear, {first_name_user} homie!')

num1 = int(input('Then enter the first number: '))
num2 = int(input('Now enter the second number: '))
print(f'The total is {num1 + num2}')

num3 = int(input('Lets enter the third number: '))
print(f'I divided that total on third number and result is {(num1 + num2) / num3}')

pieces_firstly = int(input(f'{first_name_user}, how much pizza pieces you had?: '))
pieces_eaten = int(input('Okay! How much did you eat?: '))
print(f'Jesus, {first_name_user}! There are only {pieces_firstly - pieces_eaten} pieces remain!')

age_user = int(input(f'{first_name_user}, chap, please enter your age: '))
print(f'Wow, {first_name_user}! Next birthday you will be {age_user + 1} years old.')

lunch_count = int(input(f'{first_name_user}, hou much money we ate out?: '))
attendee_count = int(input('So, how many us?: '))
print(f'Good, apparently it costs {lunch_count / attendee_count} to each other. Come on! Give me the money!')

days_count = int(input(f'{first_name_user}, homie, tell me the days number: '))
print(f'Hmm, totally it will be {days_count * 24} hours, or {days_count * 24 * 60} ' 
      f'minutes or {days_count * 24 * 60 * 60} seconds!\n'
      f'But!... if you mean kilograms, not days, then it will be {days_count * 2.204} pounds\n'
      f'Oh! {first_name_user}, do you remember about those numbers? \n'
      f'I counted that in {num1} can exist {num1 // num2} {num2} times')