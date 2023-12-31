'''Планеты вращаются вокруг звезд по эллиптическим орбитам.
Назовем самой далекой планетой ту, орбита которой имеет
самую большую площадь. Напишите функцию
find_farthest_orbit(list_of_orbits), которая среди списка орбит
планет найдет ту, по которой вращается самая далекая
планета. Круговые орбиты не учитывайте: вы знаете, что у
вашей звезды таких планет нет, зато искусственные спутники
были были запущены на круговые орбиты. Результатом
функции должен быть кортеж, содержащий длины полуосей
эллипса орбиты самой далекой планеты. Каждая орбита
представляет из себя кортеж из пары чисел - полуосей ее
эллипса. Площадь эллипса вычисляется по формуле S = pi*a*b,
где a и b - длины полуосей эллипса. При решении задачи
используйте списочные выражения. Подсказка: проще всего
будет найти эллипс в два шага: сначала вычислить самую
большую площадь эллипса, а затем найти и сам эллипс,
имеющий такую площадь. Гарантируется, что самая далекая
планета ровно одна'''

from random import uniform

print(planets := [(round(uniform(1, 5), 1), round(uniform(1, 5), 1)) for _ in range(10)])
print(planets := set(filter(lambda x: x[0] != x[1], planets)))
print(max(planets, key = lambda x: x[0] * x[1]))

# -----------------------------------------

# import random
# from math import pi

# def find_farthest_orbit(list_of_orbits):
#     return max([orbit for orbit in list_of_orbits if orbit[0] != orbit[1]])
 
 
# list_of_orbits = [(1,8), (5,4), (3, 4), (5,5), (0.8, 0.7)]
 
# print(find_farthest_orbit(list_of_orbits))

# --------------------------------------

# planets = [(random.uniform(1, 15), random.uniform(1, 15) for _ in range(5))]
# orbits = [(1, 3), (2.5, 10), (7, 2), (6, 8), (4, 3)]

# list_of_orbits = [(random.randint(1, 15), random.randint(1, 15) for _ in range(5))]
# print(list_of_orbits)

# def find_farthest_orbit(list_of_orbits):
#     max_value = 0
#     max_index = 0
#     lst = list[filter(lambda a, b: a != b, list_of_orbits)]

#     # for i, item in enumerate(list_of_orbits):
#     #     a, b = item
#     #     if a != b:
#     #         if pi * a * b > max_value:
#     #             max_value = pi * a * b
#     #             max_index = i

#     return list_of_orbits[max_index]

# print(planets)
# print(find_farthest_orbit)
