year = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30] #zero based list of values
year.append(31)
month = int(input('Month[1-12]: '))
days = year[month - 1]
amount = days * (days + 1) / 2
print('Total amount for %d days is %.2f' % (days, amount))
