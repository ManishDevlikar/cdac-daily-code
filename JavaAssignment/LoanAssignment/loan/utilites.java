package loan;

public class utilites {
    
    public static double getTotalDiscount(Loan... discountables) {
        double totalDiscount = 0;
        for(Loan loan : discountables) {
            if(loan instanceof Discountable){
                Discountable discountable = (Discountable) loan;
                totalDiscount+=discountable.getDiscount(loan.getEMI());
        }
    }
        return totalDiscount;
    }


    public static double getTotalTax(Loan... taxables) {
        double totalTax = 0;
        for(Loan loan : taxables) {
            if(loan instanceof Taxable){
                Taxable taxable = (Taxable) loan;
                totalTax+=taxable.getTax(loan.getEMI());
            }
    }
        return totalTax;
    }
}
