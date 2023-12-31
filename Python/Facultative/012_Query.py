# Запрос
# Напишите функцию, которая принимает словарь с параметрами и возвращает строку 
# запроса, сформированную из отсортированных в лексикографическом порядке 
# параметров.

# Пример:
# Код print(query({'course': 'python', 'lesson': 2, 'challenge': 17})) 
# должен возвращать строку:
# challenge=17&course=python&lesson=2

# Используя метод items(), функцию можно написать так
# В Python есть библиотека urllib для работы с параметрами URL. 
# При использовании этого модуля функция выглядит так
def query(params):
    return '&'.join(sorted(f'{k} = {v}' for k, v, in params.items())) 

from urllib.parse import urlencode
def query(params):
    sortedpar = dict(sorted(params.items()))
    return urlencode(sortedpar)