# Найдите сумму трехзначного числа

num = int(input("Введите трехзначное число: "))
sum = num // 100 + (num // 10 - num // 100 * 10) + num % 10
print(sum)