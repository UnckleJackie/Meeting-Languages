import random


attempt = 5
score = 0
for i in range(attempt):
    num1 = random.randint(1, 11)
    num2 = random.randint(1, 11)
    answer = num1 + num2
    answer_user = int((input(f'Sum of {num1} and {num2}: ')))
    if answer == answer_user:
        score += 1
print(f'Your score is {score}')
