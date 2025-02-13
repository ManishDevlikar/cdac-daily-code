def future_value(payment:float,count:int,risk:bool)->float:
    i=0.08 if risk else 0.06
    return (payment/i)*((1+i)**count-1)

# __main__ is a name of module it self if it is used by other file then the name set to that file  
if(__name__=="__main__"):
    print("welcome inestester")