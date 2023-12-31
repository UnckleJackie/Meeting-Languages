flag = False
for i in range(26):
    for j in range(26):
        for k in range(26):
            for l in range(26):
                text = f"{chr(ord('a') + i)}{chr(ord('a') + j)}{chr(ord('a') +
                k)}{chr(ord('a') + l)}"
                if text == "auff":
                    print(text)
                    flag = True
                    break
                print(text)
            if flag:
                break
        if flag:
            break
    if flag:
        break