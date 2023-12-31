first_name_user = input('Enter your first name: ')
first_name_user_length = len(first_name_user)
if first_name_user_length < 5:
    last_name_user = input('Enter your last name: ')
    full_name_user = first_name_user + last_name_user
    full_name_user = full_name_user.upper()
    print(full_name_user)
else:
    first_name_user = first_name_user.lower()
    print(first_name_user)