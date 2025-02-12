def compute(lower,upper,level=1):
    result =0
    for value in range(lower,upper+1):
        result+=value**level
    return result

l=int(input("lower limit:"))
u=int(input("upper limit:"))
print(compute(l,u))
print(compute(l,u,3))
