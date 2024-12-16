package Main;

import Tour.*;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Method;


public class Main {
    
    public static void main(String[] args) throws Throwable {
        int people = Integer.parseInt(args[0]);
        int days = Integer.parseInt(args[1]);

        Class<?> c = Class.forName("Tour." + args[2]);
        Object object = c.getConstructor(int.class, int.class).newInstance(people, days);
        Method method = c.getMethod(args[3], int.class, int.class);
        LuxuryTax lt = method.getAnnotation(LuxuryTax.class);
        double tax = lt !=null ? lt.value()/100.0 : 0.08;
        
        MethodHandle mh = MethodHandles.lookup()
            .unreflect(method)
            .bindTo(object);
        
        double perDayRate = (double)mh.invokeExact(people, days);
        System.out.println("Your per day rent is " + perDayRate);
        double totalRent = perDayRate * days;
        double withTax=(totalRent*tax)+totalRent;
        System.out.println("Your total rent incl tax is " + withTax);

    }

}
