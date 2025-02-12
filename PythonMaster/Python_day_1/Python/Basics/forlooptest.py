lower = int(input('Lower Limit: '))
upper = int(input('Upper Limit: '))
result = 0
for value in range(lower, upper + 1, 2):
    result += value * value
print('Computation Result =', result)

"""
range(5) -> [0, 1, 2, 3, 4]
range(3, 8) -> [3, 4, 5, 6, 7]
range(13, 7, -2) -> [13, 11, 9]
"""




