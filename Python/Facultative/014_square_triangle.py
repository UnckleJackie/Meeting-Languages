'''Найти площадь и периметр прямоугольного треугольника 
по двум заданным катетам.'''

# angle_1 = float(input('Enter the size of the first angle: '))
# angle_2 = float(input('Enter the size of the second angle: '))
# hypotenuse = round(((angle_1 ** 2 + angle_2 ** 2) ** 0.5), 2)

# square_triangle = round(((angle_1 * angle_2) / 2), 2)
# perimeter = angle_1 + angle_2 + hypotenuse

# print(f'The square of the triangle is: {square_triangle}\nThe perimeter of the triangle is: {perimeter}')

def square_triangle(angle_1, angle_2):
    square_triangle = (angle_1 * angle_2) / 2
    return square_triangle


def hypotenuse(angle_1, angle_2):
    hypotenuse = (angle_1 ** 2 + angle_2 ** 2) ** 0.5
    return hypotenuse    


def perimeter_triangle(angle_1, angle_2):
    perimeter = angle_1 + angle_2 + hypotenuse(angle_1, angle_2)
    return perimeter

angle_1 = float(input('Enter the first angle: '))
angle_2 = float(input('Enter the second angle: '))
print(f'The square of the triangle is {round(square_triangle(angle_1, angle_2), 2)}\n'
      f'The Perimeter of the triangle is {round(perimeter_triangle(angle_1, angle_2), 2)}')

