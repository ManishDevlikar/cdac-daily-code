import investment

p = float(input('Each Payment: '))
n = int(input("No of Payments: "))
print("future value for riskless investment :" , investment.future_value(p,n,False))
print("future value for riskfull investment :" , investment.future_value(p,n,True))