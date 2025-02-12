def compute(f,l):
    # find odd no squre
    result=0
    if f>l:
        raise Exception("invalid start")
    for value in range(f,l+1):
        if value % 2 != 0:
            result+=value*value
    return result


def compute2(f,l):
    # declarative approach
    result=0
    if f>l:
        raise Exception("invalid start")
    return sum(num*num for num in range (f,l+1) if num %2==1)

# exception handling
try:
    print(compute2(1,10))
    print(compute(100,10))
except Exception as x:
    print(x)
print("good bye...")