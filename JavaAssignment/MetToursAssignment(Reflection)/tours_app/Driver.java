package tours_app;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Method;
import tours.*;
public class Driver {
    public static void main(String[] args)throws Throwable {
        Class<?> c_class = Class.forName("tours." + args[0]);
        
        var days=Integer.parseInt(args[1]);
        var noOfPersons=Integer.parseInt(args[2]);
        
        Object o_object = c_class.getConstructor(int.class,int.class).newInstance(days,noOfPersons);
        
        Method m_method = c_class.getMethod(args[3],int.class,int.class);
        
        LuxuryTax luxuryTax = c_class.getAnnotation(LuxuryTax.class);

        double tax = luxuryTax!=null?luxuryTax.value()/100.0:0.08;

        System.out.println("Tax: "+tax);
   
        MethodHandle methodHandle = MethodHandles.lookup().unreflect(m_method).bindTo(o_object);
        
        double total=(double)methodHandle.invokeExact(days,noOfPersons);
        System.out.println("total Rent: "+total);

        double finalTotal = total+=total*tax;

        System.out.println("Total Rent with tax: "+finalTotal);
    }
}

