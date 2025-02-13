class Box:

    # self(keyword) represent object of the class same as this
    #there is no private member concept
    def build(self,length,breath,height):
        self.length = length  # initilizing instatnce variable
        self.breath = breath
        self.height = height

    def price(self):
        area=2*(self.length * self.breath + self.height * self.breath+self.length * self.height)
        rate = 1.2  if area <100 else 1.1
        return area * rate
    
    
    def capacity(self):
        return self.length * self.breath * self.height

l = float(input("Enter length: "))
b = float(input("Enter breath: "))
h = float(input("Enter height: "))

mybox = Box()
mybox.build(l,b,h)
print('Price of ligth box : ',mybox.price())
print('Capacity of ligth box : ',mybox.capacity())
