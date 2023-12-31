# Вы пользуетесь общественным транспортом?
# Вероятно вы расплачивались за проезд и получали билет с номером.
# Счастливым билетом называют такой билет с 6-значным номером, где 
# сумма первых трех цифр равна сумме последних трех.
# Напишите программу, которая проверяет "счастливость" билета

number_of_billet = int(input("Введите номер билета: "))

# second_three_digits = 

sixth_digit = number_of_billet // 100000
print("6 digit: ", sixth_digit)
fifth_digit = number_of_billet // 10000 - number_of_billet // 100000 * 10
print("5 digit: ", fifth_digit)
fourth_digit = number_of_billet // 1000 - number_of_billet // 10000 * 10
print("4 digit: ", fourth_digit)
third_digit = number_of_billet // 100 - number_of_billet // 1000 * 10
print("3 digit: ", third_digit)
second_digit = number_of_billet // 10 - number_of_billet // 100 * 10
print("2 digit: ", second_digit)
first_digit = number_of_billet % 10
print("1 digit: ", first_digit)

first_half_sum_number = sixth_digit + fifth_digit + fourth_digit
second_half_sum_number = third_digit + second_digit + first_digit

print("first sum: ", first_half_sum_number)
print("second sum: ", second_half_sum_number)

if first_half_sum_number == second_half_sum_number:
    print("Yeah!")
else:
    print("No!")