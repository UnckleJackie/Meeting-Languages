emails = {'mgu.edu': ['andrei_serov', 'alexander_pushkin', 'elena_belova', 
        'kirill_stepanov'],
        'gmail.com': ['alena.semyonova', 'ivan.polekhin', 'marina_abramova'],
        'msu.edu': ['sergei.zharkov', 'julia_lyubimova', 'vitaliy.smirnoff'],
        'yandex.ry': ['ekaterina_ivanova', 'glebova_nastya'],
        'harvard.edu': ['john.doe', 'mark.zukerberg', 'helen_hunt'],
        'mail.ru': ['roman.kolosov', 'ilya_gromov', 'masha.yashkina']}
# Необходимо дополнить код таким образом, чтобы он вывел все адреса в алфавитном
# порядке и в формате имя_пользователя@домен.
# Задача решается с помощью генератора словаря (или списка) и метода sorted()

print(*sorted({i + '@' + k for k, v in emails.items() for i in v}), sep = '\n')
