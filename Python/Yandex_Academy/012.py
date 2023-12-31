num1 = int(input())
num2 = int(input())

digit1_num1 = num1 % 10
digit1_num2 = num2 % 10
sum1 = (digit1_num1 + digit1_num2) % 10

digit2_num1 = num1 // 10 - num1 // 100 * 10
digit2_num2 = num2 // 10 - num2 // 100 * 10
sum2 = (digit2_num1 + digit2_num2) % 10

digit3_num1 = num1 // 100
digit3_num2 = num2 // 100
sum3 = (digit3_num1 + digit3_num2) % 10

print(str(sum3) + str(sum2) + str(sum1))