num = 5 + int('10')
print(num)

int_num = 5
float_num = 4.5
str_val = 'abc'

print(int_num + float_num)  # 9.5

bool_val = True
int_val = 7
print(bool_val + int_val)  # 8

print(int_num * float_num)  # 22.5
print(int_num.__mul__(float_num))  #NotImplemented
print(float_num.__rmul__(int_num))  # 22.5
print(int_num * str_val)  # abcabcabcabcabc
print(str_val.__rmul__(int_num))  # abcabcabcabcabc

print(bool)
print(dir(bool()))

my_list = []
print(help(my_list.__eq__))