def average(one,two):
    return (one+two)/2



# ** if var name argument (keys and values)
def varargs(one,two,*rem):
    sum=one+two
    count =2+len(rem)
    for value in rem:
        sum+=value
    return sum/count

print(average(12,12))
print(varargs(12,12,13,14,15))
print(varargs(12,12))