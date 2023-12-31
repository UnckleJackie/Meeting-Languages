# В некоторой школе решили набрать три новых математических класса и
# оборудовать кабинеты для них новыми партами.
# За каждой партой может сидеть два учащихся.
# Известно кол-во учащихся в каждом из трех классов.
# Выведите наименьшее число парт, которое нужно приобрести для них.\

# from math import ceil

# class_1 = int(input("Enter amount of classmates 1: "))
# class_2 = int(input("Enter amount of classmates 2: "))
# class_3 = int(input("Enter amount of classmates 3: "))
# desks = ceil(class_1 / 2) + ceil(class_1 / 2) + ceil(class_1 / 2)
# print(desks)

# from math import ceil

# class_1 = int(input("Enter amount of classmates 1: "))
# class_2 = int(input("Enter amount of classmates 2: "))
# class_3 = int(input("Enter amount of classmates 3: "))
# desks = (class_1 // 2 + bool(class_1 % 2 != 0)) + (class_1 // 2 
# + bool(class_2 % 2 != 0)) + (class_1 // 2 + bool(class_3 % 2 != 0))
# print(desks)

class_1 = int(input("Enter amount of classmates 1: "))
class_2 = int(input("Enter amount of classmates 2: "))
class_3 = int(input("Enter amount of classmates 3: "))
desks = ((class_1 + 1) // 2) + ((class_2 + 1) // 2) + ((class_3 + 1) // 2)
print(desks)