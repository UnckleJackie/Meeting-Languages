# colors = ['0365', 'green', 'blue']  # режим записи
# data = open('file.txt', 'a')  # указываем режим, в котором будем работать
# data.writelines(colors)  # разделителей не будет
# data.close()

with open('file.txt', 'w') as data: # режим перезаписи
    data.write('line 1\n')
    data.write('line 5\n')

path = 'file.txt'
data = open(path, 'r')
for line in data:
    print(line)
data.close()