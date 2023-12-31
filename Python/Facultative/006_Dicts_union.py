# Объединение словарей
# В Python предусмотрено объединение словарей:

# merged_dict = {**dict1, **dict2}

# Однако если в словарях есть одинаковые ключи, ключу в объединенном словаре 
# будет присвоено значение из второго словаря. 
# Напишите программу, которая объединяет два словаря и суммирует значения 
# одинаковых ключей.

# Воспользуемся методом get(), который принимает второй аргумент - значение
# по умолчанию, в нашем случае это должен быть 0. Кроме того, применим объединение
# множеств с помощью оператора |

dict1 = {'яблоки': 100, 'бананы': 333, 'груши': 200,
         'апельсины': 300, 'ананасы': 45, 'лимоны': 98,
         'сливы': 76, 'манго': 34, 'виноград': 90, 'лаймы': 230}
dict2 = {'яблоки': 300, 'груши': 200, 'бананы': 400, 'малина': 777, 
         'ананасы': 12, 'лаймы': 123, 'черника': 111, 'арбузы': 666}
merged_dict = {key: dict1.get(key, 0) + dict2.get(key, 0) 
               for key in set(dict1) | set(dict2)}
print('United dictionary: ', merged_dict)