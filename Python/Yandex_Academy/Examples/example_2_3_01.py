saved_pwd = "right_password"
pwd = input("Enter the password: ")
while pwd != saved_pwd:
    pwd = input("Enter the password: ")
print("Password right! Access allowed!")