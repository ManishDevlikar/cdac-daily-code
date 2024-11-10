package funcapp;

import funcinterface.Scheme;

public class Driver {
    public static void main(String[] args) {
        int year = Integer.parseInt(args[0]);
        // static method referencing
       System.out.println("with ExpenseSequence: "+Scheme.commonSum(year, Scheme::ExpenseSequence)); 
       System.out.println("with IncomeSequence: "+Scheme.commonSum(year, Scheme::IncomeSequence));

       // using lambda functions
       System.out.println("with Lambda function: "+Scheme.commonSum(year, y->year*5));
       
       // non static method referencing
       Scheme scheme = new Scheme();
       System.out.println("with non static method referencing: "+ Scheme.commonSum(year, scheme::myOwnSequence));
    }
}
