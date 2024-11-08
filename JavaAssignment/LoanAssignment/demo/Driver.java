package demo;

import loan.Loan;
import loan.Model;
import loan.utilites;

public class Driver {
    public static void main(String[] args) {
        Loan personalLoan1 = Model.getPersonalLoan(500000, 1);
        Loan personalLoan2 = Model.getPersonalLoan(500000, 1);
        Loan personalLoan3 = Model.getPersonalLoan(500000, 1);
           
        System.out.println(utilites.getTotalTax(personalLoan1, personalLoan2, personalLoan3));
        
        Loan homeLoan1 = Model.getHomeLoan(500000, 1);
        Loan homeLoan2 = Model.getHomeLoan(500000, 1);
        Loan homeLoan3 =Model.getHomeLoan(500000, 1);
        System.out.println(utilites.getTotalDiscount(homeLoan1,homeLoan2,homeLoan3));
    }
}
