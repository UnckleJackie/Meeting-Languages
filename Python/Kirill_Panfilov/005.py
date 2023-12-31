string = 'Грязный питон - охуенный питон - еще одна з'

print(string.find('з'))  # 3
print(string.find('питон'))  # 8
print(string.split(' '))  # ['Грязный', 'питон', '-', 'охуенный', 'питон', '-', 'еще', 'одна', 'з']
print(string.split('пи'))  # ['Грязный ', 'тон - охуенный ', 'тон - еще одна з']
print(string.split('-'))  # ['Грязный питон ', ' охуенный питон ', ' еще одна з']
print(string.split())  # ['Грязный', 'питон', '-', 'охуенный', 'питон', '-', 'еще', 'одна', 'з']

print(string.replace('п', 'П'))  # Грязный Питон - охуенный Питон - еще одна з
print(string.replace(' ', '|'))  # Грязный|питон|-|охуенный|питон|-|еще|одна|з
print(string.replace(' ', '|', 3))  # Грязный|питон|-|охуенный питон - еще одна з

number = '67' + '1'
print(number.isdigit())  # True
print(string.istitle())  # False

print(string.startswith('Гр'))

print(string.count('п'))
print(string.count('о'))

string2 = "- **************English**************- [ ]  Puzzle English. Урок- [ ]  Puzzle English. Тренировка новых слов 140- [ ]  Puzzle English. Тренировка созревших слов 140- [ ]  Puzzle English. Добавить незнакомые из А2 - T, U, V, W, X, Y, Z- [ ]  Английский язык. [Словарь Notion](https://www.notion.so/7b23507a87c64b3d85041325e72d3314?pvs=21). 1,650 - 2,625 слов- [ ]  990  Из списка [“5,000 слов”](https://britlex.ru/5000_7000_English_words.pdf) добавить 15 слов. К 01.10.2024 будут добавлены все- [ ]  ******************.040 стр.****************** B. Shwartz “High Performance” 826 стр. **********************************Закладка 17 стр. (1 стр. в день)**********************************"
print(string2.count('*'))
print(len(string2))
print(string2.replace('*', ''))

print(string2.strip())