
# 文字列の分割

strLine = input()


def dispData(strLine):
    str1 = strLine.split()
    return str1

str2 = dispData(strLine)


str3 = str2[0]
str4 = str2[1]

print(str3)
print(str4)

'''
以下のコードでも可

std_in = input()

for string in std_in.split():
    print(string)

'''