# abcd = int(input())
# a = str(abcd // 1000)
# b = str(abcd // 100 - abcd // 1000 * 10)
# c = str(abcd // 10 - abcd // 100 * 10)
# d = str(abcd % 10)
# print(b + a + d + c)

abcd = input()
print(abcd[1] + abcd[0] + abcd[3] + abcd[2])