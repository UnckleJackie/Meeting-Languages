# while input("Enter string (STOP to discontinue): ") != "STOP":
#     pass
# else:
#     print("Cycle is over!")

while (text := input("Enter string (STOP to discontinue): ")) != "STOP":
    if text == "ignore_else":
        break
else:
    print("Cycle is over!")