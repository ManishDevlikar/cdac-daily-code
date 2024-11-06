package demo;

import loan.Loan;
import loan.PersonalLoan;

public class Driver {
    public static void main(String[] args) {
        Loan personalLoan = new PersonalLoan(500000, 1);
        System.out.println(personalLoan.getEMI());
        
    }
}
