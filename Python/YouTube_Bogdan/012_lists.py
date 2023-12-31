empty_list = []
my_fruits = ['apple', 'banana', 'lime']
other_fruits = ['banana', 'apple', 'lime']
posts_ids = [151, 245, 762, 167]
user_inputs = [True, 'hi!', ':)', 10.5]

print(bool(my_fruits == other_fruits))

print(len(empty_list))  # 0
print(len(my_fruits))  # 3
print(len(other_fruits))  # 3
print(len(posts_ids))  # 4
print(len(user_inputs))  # 4

print(posts_ids[0])  # 151
print(posts_ids[1], other_fruits[2], user_inputs[0])  # 245 lime True
print(my_fruits[-1])  # lime

posts_ids[0] = 555
posts_ids[2] = 333
print(posts_ids)  # [555, 245, 333, 167]

# posts_ids[4] = 800
# print(posts_ids)

del user_inputs[1]
print(user_inputs)  # [True, ':)', 10.5]
print(len(user_inputs))  # 3

del user_inputs[-1]
print(user_inputs)  # [True, ':)']
print(len(user_inputs))  # 2

