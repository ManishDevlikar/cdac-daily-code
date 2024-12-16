package app;

import java.util.Scanner;
import shape.Figure;

public class Driver {
    public static void main(String[] args) {
         getStart();
    }
    public static void getStart(){
        System.out.println("Enter number to calculate volume: ");
        System.out.println("1: cube  2: sylinder 3: sphere 4: Exit");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch(choice){
            case 1:
            Figure cube=new Figure();
            System.out.println("Enter input for cube");
            int a=sc.nextInt();
            double cres=cube.compute(a);
            System.out.println(cres);
            getStart();
            break;
            case 2:
            Figure cylinder=new Figure();
            System.out.println("Enter 1 input for cube");
            System.out.println("Enter 2 input for cube");
            int b=sc.nextInt();
            int c=sc.nextInt();
            double cyres=cylinder.compute(b,c);
            System.out.println(cyres);
            getStart();
            break;

            case 3:
            Figure sphere=new Figure();
            System.out.println("Enter 1 input for cube");
            double d=sc.nextDouble();
            double sphres=sphere.compute(d);
            System.out.println(sphres);
            getStart();
            break;

            case 4:
            break;

            default:
            System.out.println("Wrong input");
            getStart();
        }
    }
}
