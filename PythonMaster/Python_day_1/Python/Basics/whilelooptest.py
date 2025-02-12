num = int(input('Positive Integer: '))
if num < 0: num = -num
sum = 0
while num > 0:
    sum = sum + num % 10
    num = num // 10
print('Sum of Digits =', sum)
