package loan;

public class Utilities {
    public static Loan getPersonalLoan(double principle, double months){
        var pLoan = new PersonalLoan(principle, months);
        return pLoan;
    }

    public static Loan getHomeLoan(double principle, double months) {
        var hLoan = new HomeLoan(principle, months);
        return hLoan;
    }

    public static double getTotalDiscount(Loan... loans) {
        double totalDiscount = 0.0;
        for (Loan loan : loans) {
            if (loan instanceof Discountable discountable) {
                totalDiscount += discountable.getDiscount();
            }
        }
        return totalDiscount;
    }

    public static double getTotalTax(Loan... loans) {
        double totalTax = 0.0;
        for(Loan loan : loans) {
            if (loan instanceof Taxable taxable) {
                totalTax += taxable.getTax();
            }
        }
        return totalTax;
    }

    private Utilities(){}
}
