# Редкое слово
# Напишите программу, которая принимает на вход строку, и выводит слово, 
# которое встречается во фразе реже всего. Если редких слов несколько, 
# нужно вывести то, которое меньше в лексикографическом порядке. 
# Регистр слов не учитывается, знаки препинания в предложениях игнорируются.

# Пример ввода:
# дом, милый дом, милый.

# Пример вывода:
# дом

# Для подсчета символов, слов и тп удобно использовать метод get(), 
# а для сортировки - лямбда-функцию, которая обеспечит вывод наименьшего из редких слов

words = {}
for i in input().split():
    i = i.strip(' .,!?:;-').lower()
    words[i] = words.get(i, 0) + 1
print(min(words.items(), key = lambda x: (x[1], x[0]))[0])

