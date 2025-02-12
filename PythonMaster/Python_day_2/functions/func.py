def banner_price(w,h):
#  does not have ternary operator
    rate = 0.85 if w>h else 0.95
    return w*h*rate


h=float(input("Banner h: "))
w=float(input("Banner w: "))
n=float(input("numbers of Banner: "))


print("Banner price for regular: ",banner_price(w,h)*n)
print("Banner price for premium: ",banner_price(w+1,h+1)*n)
# we can pass argument by name in any order java,c does no si=upport but c# supports
# does not support overloading it supports default arguments like other languages