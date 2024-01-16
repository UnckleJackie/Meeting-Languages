nums = []
for i in range(3):
    nums.append(input('Enter the number: '))
    print(nums)
answer_user = input('Do you want to remove the last number? (y/n): ')
if answer_user == 'y':
    del nums[-1]
print(nums)
