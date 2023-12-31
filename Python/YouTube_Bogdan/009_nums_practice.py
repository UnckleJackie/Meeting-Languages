input_str = input("Enter any number: ")
print(input_str)
print(type(input_str))

input_int = int(input_str)
print(type(input_int))

average_price = input_int / 3.6
print(average_price)
print(type(average_price))  # <class 'float'>
price = int(average_price)
print(price)
print(type(price))

str_temperature = '14.5'
temperature = float(str_temperature)

print(temperature)
print(type(temperature))

print(f'Round average price: {round(average_price)}')
rate = 0.78473
print(round(rate))
print(type(round(rate)))

# Complex numbers
complex_a = 3 + 5j
complex_b = 4 + 7j
summa = complex_a + complex_b
print(summa)  # (7+12j)
print(type(summa))  # <class 'complex'>

complex_c = 10 + 7j
complex_d = 3 + 3j
print(complex_c + complex_d)
print(complex_c - complex_d)
print(complex_c * complex_d)
print(complex_c / complex_d)
