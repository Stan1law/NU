# Problem: Write a program that takes a string as input and prints out the number of vowels in the string.

# Example Input/Output:

# Input: "Hello World"
# Output: 3 (because there are 3 vowels: e, o, and o)
# Constraints:

# The input string will only contain letters (a-z or A-Z) and spaces.
# You can assume that the input string is not null.
# Your Task:

# Write a method that takes a string as input and returns the number of vowels in the string.

# Hint: You can use a simple loop to iterate over the characters in the string, and a conditional statement to check if each character is a vowel.


# Solution:

input_string = "Hello World"

vowel_count = 0
for char in input_string:
    if char in ("a", "e", "i", "o", "u", "A", "E", "I", "O", "U"):
        vowel_count += 1

print("There are", vowel_count, "vowels in the string")
