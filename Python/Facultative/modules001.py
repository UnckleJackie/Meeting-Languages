import re

def isCyrillic(text):
    return bool(re.search('[а-яА-Я]', text))


def square_triangle(angle_1, angle_2):
    square_triangle = (angle_1 * angle_2) / 2
    return square_triangle


def hypotenuse(angle_1, angle_2):
    hypotenuse = (angle_1 ** 2 + angle_2 ** 2) ** 0.5
    return hypotenuse    


def perimeter_triangle(angle_1, angle_2):
    perimeter = angle_1 + angle_2 + hypotenuse(angle_1, angle_2)
    return perimeter