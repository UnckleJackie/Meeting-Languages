# На столе лежат n монеток. Некоторые из них лежат вверх
# решкой, а некоторые – гербом. Определите минимальное число
# монеток, которые нужно перевернуть, чтобы все монетки были
# повернуты вверх одной и той же стороной. Выведите минимальное
# количество монет, которые нужно перевернуть.

coins = list
coins = [0, 1, 1, 1, 0]
coin_even = 0
coin_odd = 0
print(coin_odd)
for i in coins:
    print(i, end = ' ')
    if i == 1: 
        coin_odd += 1
    else:
        coin_even += 1
print('\n', coin_odd)
print(coin_even)
if coin_odd <= coin_even:
    print(coin_odd)
else:
    print(coin_even)


#     #i = coins[i]
#     print(i)
#     if i == 0:
#         coin_even += 1
#     else:
#         coin_odd -= 1
#     i +=1 
#     print(i)
# print(coin_even, coin_odd)
# if coin_even >= coin_odd:
#     print(coin_odd)
# else:
#     print(coin_even)

#print(coin_even if coin_even < coins / 2 else coins - coin_even)