#文字列を切り取る (paizaランク D 相当)


nums = input().split()
line = input()
num1 = int(nums[0])
num2 = int(nums[1])

num3 = num1 - 1

print(line[num3 : num2])


# nums = input().split()
# string = input()

# print(string[int(nums[0]) - 1:int(nums[1])])
