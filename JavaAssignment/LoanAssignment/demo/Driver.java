package demo;

import loan.HomeLoan;
import loan.Loan;
import loan.PersonalLoan;
import loan.utilites;

public class Driver {
    public static void main(String[] args) {
        Loan personalLoan1 = new PersonalLoan(500000, 1);
        Loan personalLoan2 = new PersonalLoan(500000, 1);
        Loan personalLoan3 = new PersonalLoan(500000, 1);
           
        System.out.println(utilites.getTotalTax(personalLoan1, personalLoan2, personalLoan3));
        
        Loan homeLoan1 = new HomeLoan(500000, 1);
        Loan homeLoan2 = new HomeLoan(500000, 1);
        Loan homeLoan3 = new HomeLoan(500000, 1);

        System.out.println(utilites.getTotalDiscount(homeLoan1,homeLoan1,homeLoan3));
    }
}
