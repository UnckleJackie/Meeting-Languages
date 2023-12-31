# Отступы и форматирование кода, комментарии
def my_name(name):
    print(name)

my_name('Bogdan')
# Ctrl + Shift + P -> format - Форматирование кода (не работает)
my_list =       [1, 2,      3  ]

print(   my_list)

# This is comment
# Ctrl + / - comment string or piece of code
# Ctrl + Shift + K - remove full string

def hello():
    print('Hello there!')


def hello_1(text):
    print(f'Смотри, какую околесицу ты написал: {text}')


def knowledge(name, age, city):
    print(f'Я пробил тебя: \n'
          f'Зовут тебя: {name}!\n'
          f'Лет тебе: {age}\n'
          f'Ты из города {city}\n')

hello()
string_1 = input('Enter something: ')
hello_1(string_1)
knowledge("Дядя Женя", "40", "Краснодар")


