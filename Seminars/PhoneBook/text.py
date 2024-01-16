main_menu = ['Main menu', 
                        'Open file', 
                        'Save file', 
                        'Show contacts', 
                        'Create contact', 
                        'Find contact', 
                        'Change contact', 
                        'Remove contact', 
                        'Exit']


main_menu_choice = 'Select menu item: '
load_successful = 'Phone book loaded successful!'
save_successful = 'Phone book saved successful!'

empty_phone_book = 'Phone book is empty or not open!'

new_contact = ['Enter the name: ', 
                        'Enter the phone number: ', 
                        'Enter the comment: ']

def new_contact_added_successful(name: str):
    return f'Contact {name} added successful!'

input_search_word = 'Enter the search word: '


def contacts_not_found(word: str) -> str:
    return f'Contacts, contained {word} not found!'

input_id_change_contact = 'Enter ID of contact you want to change: '

change_contact = ['Enter new Name or press ENTER if no changes: '
                           'Enter new Phone number or press ENTER: ',
                            'Enter new comment or press ENTER: ']


def contact_changed_successful(name: str) -> str:
    return f'Contact {name} changed successful!'

input_id_remove_contact = 'Enter ID of contact you want to remove: '

def contact_removed_successful(name: str) -> str:
    return f'Contact {name} removed successful!'

good_bye = 'Hasta la vista, baby...'
