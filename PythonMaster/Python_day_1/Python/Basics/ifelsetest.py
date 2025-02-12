age = int(input('Age: '))
if age == 18:
    print('Big Birthday!')
    rate = 75
elif age == 21:
    print("Big Birthday!!")
    rate = 125
else: 
    rate = 50
print('Gift Amount: %.2f' % (rate * age))

