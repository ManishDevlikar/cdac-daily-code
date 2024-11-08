package main;

import loan.HomeLoan;
import loan.Loan;
import loan.PersonalLoan;

public class Main {
    public static void main(String[] args) {
        
        Loan pLoan = new PersonalLoan(45000, 1);
        System.out.println(pLoan.getEMI());

        Loan hLoan = new HomeLoan(6000000, 15);
        System.out.println(hLoan.getEMI());
    }
}
