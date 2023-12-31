some_one = 'word'
some_two = 'word'
some_three = 'wo\"rd'
print(some_three)
some_four = 'wo\'r\'d'
print(some_four)
print(type(some_two))

string = 'word' + ' one more word'
print(string[3])
print(string[5:8])
print(id(string))
print(id(string[5:8]))

string_slice = string[8:]
print(string_slice)

string_slice2 = string[:-5]
print(string_slice2)

string_slice3 = string[::2]
print(string_slice3)

string_slice4 = string[::-1]
print(string_slice4)

