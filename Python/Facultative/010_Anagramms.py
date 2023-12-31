# Анаграммы
# Напишите программу, которая принимает на вход две строки и определяет, 
# являются ли они анаграммами. Знаки препинания, пробелы и регистр при этом 
# игнорируются.

# Пример ввода:
# Цари, вино и сало.
# Лисица и ворона.

# Пример вывода:
# YES

# Избавиться от знаков препинания можно несколькими способами - с помощью
# strip(), replace(), или просто путем добавления в словарь только букв 
# (метод isalpha()) из введенных строк

def a(word):
    result = {}
    for i in word.lower():
        if i.isalpha():
            result[i] = result.get(i, 0) + 1
        return result
print('YES' if a(input()) == a(input()) else 'NO')