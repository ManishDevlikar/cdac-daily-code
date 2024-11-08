package loan;

public class HomeLoan extends Loan implements Discountable{
    
    public HomeLoan(double principle, double duration) {
        super(principle, duration);
    }

    @Override
    public double getRate () {
        return super.getPrinciple() >= 5000000 ? 9.5 : 10;
    }

    @Override
    public double getDiscount() {
        return super.getEMI() * 0.05;
    }

}
