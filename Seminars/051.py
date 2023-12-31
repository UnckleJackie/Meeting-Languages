'''Напишите функцию same_by(characteristic, objects), которая
проверяет, все ли объекты имеют одинаковое значение
некоторой характеристики, и возвращают True, если это так.
Если значение характеристики для разных объектов
отличается - то False. Для пустого набора объектов, функция
должна возвращать True. Аргумент characteristic - это
функция, которая принимает объект и вычисляет его
характеристику.'''

def same_by(characteristic, values):
    return len(set(map(characteristic, values))) < 2 

a = list('1234f5678')

print(same_by(lambda x: x.isdigit(), a))

# def same_by(characteristic, objects):
#   return len(set(map(characteristic, objects))) < 2


# same_by = lambda x: x % 2, [0, 2, 10, 6]
# #   =>   True 
# same_by = lambda x: x % 2, [1, 7, −3]
# #   =>   True 
# same_by = lambda x: x % 2, []
# #   =>   True 
# same_by = lambda x: x % 2, [1, 2, 3, 4]
# #   =>   False
