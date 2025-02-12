year = {'jan': 31, 'feb': 28, 'mar': 31, 'apr': 30, 'may': 31, 'jun': 30, 'jul': 31, 'aug': 31, 'sep': 30, 'oct': 31, 'nov': 30}
year['dec'] = 31
month = input('Month[jan-dec]: ')
days = year[month]
amount = days * (days + 1) / 2
print('Total amount for %d days is %.2f' % (days, amount))
