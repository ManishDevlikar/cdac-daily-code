package loan;

public class HomeLoan extends Loan {
    
    public HomeLoan(double principle, double duration) {
        super(principle, duration);
    }

    @Override
    public double getRate () {
        return super.getPrinciple() >= 5000000 ? 9.5 : 10;
    }

}
