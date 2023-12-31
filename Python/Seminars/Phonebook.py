"""Создать телефонный справочник с возможностью импорта и экспорта данных в формате .txt.
Фамилия, имя, отчество, номер телефона - данные, которые должны находиться в файле.
1. Программа должна выводить данные
2. Программа должна сохранять данные в текстовом файле
3. Пользователь может ввести одну из характеристик для поиска определенной записи(Например имя или фамилию человека)
4. Использование функций. Ваша программа не должна быть линейной """

def choose_action(phonebook):
    while True:
        print('''
----------------TEVTONIC SHIFT---------------------

Друг, ты держишь в руках не просто справочник!
Это настоящий тевтонский сдвиг в мире справочнинга! 
                    Наслаждамба!
Дальше извиняй, все будет на английском, ибо я его учу, 
и тебе не просто рекомендую, а прямо сейчас вместе этим и займемся :) Итак... 
              
What do you want to do, chap?\n''')
        user_choice = input('1 - Import data\n2 - Find contact\n3 - Add contact\n'
                            '4 - Change contact\n5 - Delete contact\n6 - View all contacts\n'
                            '0 - Sign out\n')
        print()
        if user_choice == '1':
            file_to_add = input('Enter the name of import file: ')
            import_data(file_to_add, phonebook)
        elif user_choice == '2':
            contact_list = read_file_to_dict(phonebook)
            find_number(contact_list)
        elif user_choice == '3':
            add_phone_number(phonebook)
        elif user_choice == '4':
            change_phone_number(phonebook)
        elif user_choice == '5':
            delete_contact(phonebook)
        elif user_choice == '6':
            show_phonebook(phonebook)
        elif user_choice == '0':
            print('Good luck, homie!')
            break
        else:
            print('Incorrect command, dude! Come on! Don\'t be a fool.')
            print()
            continue


def import_data(file_to_add, phonebook):
    try:
        with open(file_to_add, 'r', encoding = 'utf-8'
        ) as new_contacts, open(phonebook, 'a', encoding = 'utf-8') as file:
            contacts_to_add = new_contacts.readlines()
            file.writelines(contacts_to_add)
    except FileNotFoundError:
        print(f'{file_to_add} not found!')


def read_file_to_dict(file_name):
    with open(file_name, 'r', encoding = 'utf-8') as file:
        lines = file.readlines()
    headers = ['Last Name', 'First Name', 'Phone Number']
    contact_list = []
    for line in lines:
        line = line.strip().split()
        contact_list.append(dict(zip(headers, line)))
    return contact_list


def read_file_to_list(file_name):
    with open(file_name, 'r', encoding = 'utf-8') as file:
        contact_list = []
        for line in file.readlines():
            contact_list.append(line.split())
    return contact_list


def search_parameters():
    print('On what field search?')
    search_field = input('1 - Last Name\n2 - First Name\n3 - Phone Number\n')
    print()
    search_value = None
    if search_field == '1':
        search_value = input('Enter Last Name for search: ')
        print()
    elif search_field == '2':
        search_value = input('Enter First Name for search: ')
        print()
    elif search_field == '3':
        search_value = input('Enter Phone Number for search: ')
        print()
    return search_field, search_value


def find_number(contact_list):
    search_field, search_value = search_parameters()
    search_value_dict = {'1': 'Last Name', '2': 'First Name', '3': 'Phone Number'}
    found_contacts = []
    for contact in contact_list:
        if contact[search_value_dict[search_field]] == search_value:
            found_contacts.append(contact)
        if len(found_contacts) == 0:
            print('Contact not found!')
        else:
            print_contacts(found_contacts)
        print()


def get_new_number():
    last_name = input('Enter Last Name: ')
    first_name = input('Enter First Name: ')
    phone_number = input('Enter Phone Number: ')
    return last_name, first_name, phone_number


def add_phone_number(file_name):
    info = ' '.join(get_new_number())
    with open(file_name, 'a', encoding = 'utf-8') as file:
        file.write(f'{info}\n')


def show_phonebook(file_name):
    list_of_contacts = sorted(read_file_to_dict(file_name), key = lambda x: x['Last Name'])
    print_contacts(list_of_contacts)
    print()
    return list_of_contacts


def search_to_modify(contact_list: list):
    search_field, search_value = search_parameters()
    search_result = []
    for contact in contact_list:
        if contact[int(search_field) - 1] == search_value:
            search_result.append(contact)
    if len(search_result) == 1:
        return search_result[0]
    elif len(search_result) > 1:
        print('Some contacts found')
        for i in range(len(search_result)):
            print(f'{i + 1} - {search_result[i]}')
        num_count = int(input('Choose the contact number you want to change / delete: '))
        return search_result[num_count - 1]
    else:
        print('Contact didn\'t find')
    print()


def change_phone_number(file_name):
    contact_list = read_file_to_list(file_name)
    number_to_change = search_to_modify(contact_list)
    contact_list.remove(number_to_change)
    print('Which field do you want to change?')
    field = input('1 - Last Name\n2 - First Name\n3 - Phone Number\n')
    if field == '1':
        number_to_change[0] = input('Enter Last Name: ')
    elif field == '2':
        number_to_change[1] = input('Enter First Name: ')
    elif field == '3':
        number_to_change[2] = input('Enter Phone Number: ')
    contact_list.append(number_to_change)
    with open(file_name, 'w', encoding = 'utf-8') as file:
        for contact in contact_list:
            line = ' '.join(contact) + '\n'
            file.write(line)


def delete_contact(file_name):
    contact_list = read_file_to_list(file_name)
    number_to_change = search_to_modify(contact_list)
    contact_list.remove(number_to_change)
    with open(file_name, 'w', encoding = 'utf-8') as file:
        for contact in contact_list:
            line = ' '.join(contact) + '\n'
            file.write(line)


def print_contacts(contact_list: list):
    for contact in contact_list:
        for key, value in contact.items():
            print(f'{key}: {value:12}', end = '')
        print()


if __name__ == '__main__':
    file = 'Phonebook.txt'
    choose_action(file)
