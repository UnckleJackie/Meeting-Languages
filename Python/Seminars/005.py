# Вагоны в электричке пронумерованы натуральными числами, начиная с 1.
# При этом иногда вагоны нумеруются от "головы", иногда - с "хвоста";
# Это зависит от того, в какую сторону едет электричка.
# в каждом вагоне написан его номер.
# Витя сел в i-й вагон от головы поезда и обнаружил, что его вагон имеет номер j.
# Он хочет определить сколько всего вагонов в электричке. 
# Напишите программу, которая будет это делать или сообщать, 
# что без дополнительной информации это сделать невозможно.

# vagon_number_i = int(input("Введите вагон с головы: "))
# vagon_number_j = int(input("Введите вагон с хвоста: "))
# if vagon_number_i != vagon_number_j:
#     vagon_total = vagon_number_i + vagon_number_j - 1
#     print(vagon_total)
# else:
#     print("Нифига не понять, сколько вагонов!")

target_wagon = int(input())
number_wagon = int(input())

if target_wagon != number_wagon:
    result = f'{target_wagon + number_wagon - 1}'
else:
    print("nothing")
