print(
    "Select Operation: \n"
    "1. ADDITION\n"
    "2. SUBTRACTION\n"
    "3. MULTIPLICATION\n"
    "4. DIVISION"
)

operator = input("Enter your operator 1/2/3/4: ")

num1 = int(input("Enter the first number: "))
num2 = int(input("Enter the second number: "))


def add(num1, num2):
    return num1 + num2


def subtract(num1, num2):
    return num1 - num2


def multiply(num1, num2):
    return num1 * num2


def divide(num1, num2):
    return num1 / num2


if operator == "1":
    print(add(num1, num2))

if operator == "2":
    print(subtract(num1, num2))

if operator == "3":
    print(multiply(num1, num2))

if operator == "4":
    if num2 == 0:
        print("Cannot divide by zero")
    else:
        print(divide(num1, num2))
