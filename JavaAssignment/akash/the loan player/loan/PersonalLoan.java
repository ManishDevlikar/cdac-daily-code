package loan;

public class PersonalLoan extends Loan {
    public PersonalLoan(double principle, double duration) {
        super(principle, duration);
    }

    @Override
    public double getRate() {
        return super.getPrinciple() <= 500000 ? 0.15 : 0.16;
    }

}
