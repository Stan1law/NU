list_num = []

print("Enter 5 numbers")
num1 = int(input("Input number 1: "))
num2 = int(input("Input number 2: "))
num3 = int(input("Input number 3: "))
num4 = int(input("Input number 4: "))
num5 = int(input("Input number 5: "))

for i in [num1, num2, num3, num4, num5]:
    list_num.append(i)

list_num.sort(reverse=True)
print(list_num)
