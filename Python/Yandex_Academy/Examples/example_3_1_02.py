print('a'.islower())
print('A'.islower())

string01 = 'hello, World!'
print('Method capitalize: ', string01.capitalize())

string02 = 'Hello, world!'
print('Method count(\'l\'): ', string02.count('l'), '\n'
    'Method endswith(\'world!\'): ', string02.endswith('world!'), '\n'
    'Method find(\'o\'): ', string02.find('o'), '\n'
    'Method index(\'o\'): ', string02.index('o'), '\n')

string03 = 'abc123'
print('Method isalnum(): ', string01.isalnum(), string02.isalnum(), string03.isalnum())

string04 = 'Letters'
print('Method isalpha(): ', string01.isalpha(), string02.isalpha(), 
      string03.isalpha(), string04.isalpha())

string05 = '123'
print('Method isdigit(): ', string01.isdigit(), string02.isdigit(), 
      string03.isdigit(), string04.isdigit(), string05.isdigit())
print('Method islower(): ', string01.islower(), string02.islower(), 
      string03.islower(), string04.islower(), string05.islower())

string06 = 'HELLO WORLD 123!'
print('Method isupper(): ', string01.isupper(), string02.isupper(), 
      string03.isupper(), string04.isupper(), string05.isupper(), 
      string06.isupper())

string07 = ['1', '2', '3']
print('Method join(str_col): ', ';'.join(string07), '\n'
      'Method ljust(width, fillchar): ', string04.ljust(10, '='))

string08 = 'stringBCCA'
print('Method rstrip(chars): ', string08.rstrip('ABC'))

string09 = 'one, two, three'
print('Method split(sep): ', string09.split(','), '\n'
      'Method startwith(prefix): ', string02.startswith('Hello'), '\n')

string10 = 'abc Hello, world! cba'
print('Method strip(chars): ', string10.strip('abc'), '\n'
      'Method title(): ', string01.title(), '\n'
      'Method upper(): ', string02.upper(), '\n'
      'Method zfill(width): ', string05.zfill(7))


