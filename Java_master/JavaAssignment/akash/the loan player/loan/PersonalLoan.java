package loan;

public class PersonalLoan extends Loan implements Taxable {
    public PersonalLoan(double principle, double duration) {
        super(principle, duration);
    }

    @Override
    public double getRate() {
        return super.getPrinciple() <= 500000 ? 0.15 : 0.16;
    }

    @Override
    public double getTax() {
        return super.getEMI() * 0.1;
    } 

}
