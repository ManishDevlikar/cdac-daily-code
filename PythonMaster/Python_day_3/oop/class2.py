class Box:
   
    def build(self,length,breath,height):
        self._layers=1
        self._area=2*(length * breath + height * breath+ length *height)

    def harden(self):
        self._layers += 1


    def price(self):
        area=2*self._area
        rate = 1.2  if area <100 else 1.1
        return area * rate *self._layers
    


l = float(input("Enter length: "))
b = float(input("Enter breath: "))
h = float(input("Enter height: "))

mybox = Box()
mybox.build(l,b,h)
print('Price of ligth box : ',mybox.price())
mybox.harden()
mybox.harden()
print('Price of ligth box : ',mybox.price())
