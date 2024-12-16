package main;

import loan.Loan;
import loan.Utilities;

public class Main {
    public static void main(String[] args) {
        
        Loan pLoan1 = Utilities.getPersonalLoan(45000, 1);
        System.out.println(pLoan1.getEMI());

        Loan hLoan1 = Utilities.getHomeLoan(6000000, 15);
        System.out.println(hLoan1.getEMI());

        Loan pLoan2 = Utilities.getPersonalLoan(45000, 1);
        System.out.println(pLoan2.getEMI());

        Loan hLoan2 = Utilities.getHomeLoan(6000000, 15);
        System.out.println(hLoan2.getEMI());

        Loan pLoan3 = Utilities.getPersonalLoan(45000, 1);
        System.out.println(pLoan3.getEMI());

        Loan hLoan3 = Utilities.getHomeLoan(6000000, 15);
        System.out.println(hLoan3.getEMI());

        System.out.println(Utilities.getTotalTax(pLoan1, pLoan2, pLoan3));

        System.out.println(Utilities.getTotalDiscount(hLoan1, hLoan2, hLoan3));
    }
        
}
