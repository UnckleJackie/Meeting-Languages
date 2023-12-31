# for i in range(26):
#     for j in range(26):
#         for k in range(26):
#             for l in range(26):
#                 if i == j == k == l:
#                     continue
#                 print(f"{chr(ord('a')+ i)}{chr(ord('a') + j)}{chr(ord('a') + 
#                 k)}{chr(ord('a') + l)}")

for i in range(26):
    for j in range(26):
        for k in range(26):
            for l in range(26):
                if i != j != k != l:
                    print(f"{chr(ord('a') + i)}{chr(ord('a') + 
                    j)}{chr(ord('a') + k)}{chr(ord('a') + l)}")