# Напишите программу для печати всех уникальных
# значений в словаре.
# Input: [{"V": "S001"}, {"V": "S002"}, {"VI": "S001"},
# {"VI": "S005"}, {"VII": " S005 "}, {" V ":" S009 "}, {" VIII ":" S007 "}]
# Output: {'S005', 'S002', 'S007', 'S001', 'S009'}
# Примечание: Список словарей задан изначально.
# Пользователь его не вводит

dict_1 = {'V' : 'S001'}
dict_2 = {'V' : 'S002'}
dict_3 = {'VI' : 'S001'}
dict_4 = {'VI' : 'S005'}
dict_5 = {'VII' : ' S005 '}
dict_6 = {' V ' : ' S009 '}
dict_7 = {' VIII ' : ' S007 '}
dict_list = [{"V": "S001"}, {"V": "S002"}, {"VI": "S001"},
{"VI": "S005"}, {"VII": " S005 "}, {" V ":" S009 "}, {" VIII ":" S007 "}]

st = set()
for dct in dict_list:
    for value in dct.values():
        st.add(value)
print(st)