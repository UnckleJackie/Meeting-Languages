word_user = input('Enter the word: ')
first = word_user[0]
length = len(word_user)
rest = word_user[1:length]
if first != 'a' and first != 'e' and first != 'i' and first != 'o' and first != 'u':
    new_word = rest + first + 'ay'
else:
    new_word = word_user + 'way'
print(new_word.lower())