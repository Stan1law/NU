# Problem: Write a program that takes a list of integers as input and prints out the second-largest number in the list.

# Example Input/Output:

# Input: [10, 20, 30, 40, 50]
# Output: 40
# Input: [5, 5, 5, 5, 5]
# Output: None (since all numbers are the same)
# Constraints:

# The input list will contain at least two elements.
# The input list will only contain integers.
# If all numbers in the list are the same, the program should print None.
# Your Task:

# Write a Java (or Python, if you prefer) program that takes a list of integers as input and prints out the second-largest number in the list.

# Hint: You can use a simple loop to iterate over the list, and keep track of the maximum and second-maximum values as you go.


# Solution:
numbers = [1, 2, 3, 4, 5]

max_num = max(numbers)
second_max = None

for num in numbers:
    if num != max_num and (second_max is None or num > second_max):
        second_max = num

print(second_max if second_max is not None else "None")
