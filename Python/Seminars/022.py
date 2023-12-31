# Даны два неупорядоченных набора целых чисел (может быть, с
# повторениями). Выдать без повторений в порядке возрастания все те числа, которые
# встречаются в обоих наборах.
# Пользователь вводит 2 числа. n - кол-во элементов первого множества. m - кол-во
# элементов второго множества. Затем пользователь вводит сами элементы множеств.
# 11 6
# 2 4 6 8 10 12 10 8 6 4 2
# 3 6 9 12 15 18
# 6 12

#from random import randint

# var2 = '1 2 3'
# var3 = '1 2 3 4'


# n_set = set(randint(1, 20) for i in range(int(input('Enter the first set amount of units: '))))
# print(n_set)
# m_set = set(randint(1, 20) for i in range(int(input('Enter the second set amount of units: '))))
# print(m_set)
# s_set = sorted(var2.intersection(var3))
# print(*s_set)

#var1 = [int(x) for x in input().split()]
# var1 = [5, 5]
# # n = var1[0]
# # m = var1[1]
# myset_1 = set()
# myset_2 = set()
# list_1 = list()
# #a = [int(x) for x in input().split()]
# var2 = [10, 20, 30, 40, 50]
# k = set(var2)
# for i in k:
#     myset_1.add(i)
# #b = [int(x) for x in input().split()]
# var3 = [10, 20, 30, 40, 50]
# k1 = set(var3)
# for i in k1:
#     myset_2.add(i)
# lok = myset_1 & myset_2
# kool = list(lok)
# kool.sort()
# for i in kool:
#     print(i, end = ' ')
import random
# var2 = {}
# var3 = {}
#var2 = {10, 20, 30, 40, 50}
#var3 = {10, 20, 30, 40, 50}
#s_set = {}
# var1 = '5 4' 
# var2 = '1 3 5 7 9' 
# var3 = '2 3 4 5' 
# var2_1 = set(var2)
# for i in var2:
#     var2_1.add(i)
# print(var2_1)
# var3_1 = set(var3)
# for i in var3:
#     var3_1.add(i)
# print(var3_1)
# un_var23 = var2_1 & var3_1
# lun_var23 = list(un_var23)
# lun_var23.sort()
# print(lun_var23)
# for i in lun_var23:
#     print(i, end = ' ')
# s_set = sorted(var2_1.intersection(var3_1))
# print(s_set)

var1 = '5 5' 
var2 = '10 20 30 40 50' 
var3 = '10 20 30 40 50' 

myset_1 = set(var2.split())
myset_2 = set(var3.split())
list_1 = list()
# print(sorted.var2)
print(myset_1)
print(myset_2)

# lok = var2 & var3
# print(lok)

k = list(myset_1)
for i in k:
    myset_1.add(i)
print(myset_1)
k1 = set(myset_2)
for i in k1:
    myset_2.add(i)
lok = myset_1 & myset_2
kool = list(lok)
kool.sort()
for i in kool:
    print(i, end = ' ')