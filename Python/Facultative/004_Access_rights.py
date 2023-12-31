# Права доступа
# Вирус повредил систему прав доступа к файлам. 
# Известно, что над каждым файлом можно производить определенные действия:
# запись – W;
# чтение – R;
# запуск – X.
# На вход программе подается:
# число n – количество файлов;
# n строк с именами файлов и допустимыми операциями;
# число m – количество запросов к файлам;
# m запросов вида «операция файл».
# Для каждого допустимого запроса программа должна возвращать OK, 
# для недопустимого – Access denied.

# Пример ввода: 
# 3
# python.exe X
# book.txt R W
# notebook.exe R W X
# 5
# read python.exe
# read book.txt
# write notebook.exe
# execute notebook.exe
# write book.txt

# Пример вывода:
# Access denied
# OK
# OK
# OK
# OK

# Для сопоставления соответствия команд правам доступа создадим словарь rights, 
# для записи введенных имен - словарь names.
# Конструкция print(('Access denied', 'OK')[comm in names[n]]), 
# которая выводит результат аналогична print('OK' if comm in names[n] else 'Access denied')
# и заменяет цикл с условием

names = {}
rights = {'W': 'write', 'R': 'read', 'X': 'execute'}
for i in range(int(input())):
    x = input().split()
    names[x[0]] = [rights[i] for i in x[1:]]
for i in range(int(input())):
    comm, n = input().split()
    print('OK' if comm in names[n] else 'Access denied')