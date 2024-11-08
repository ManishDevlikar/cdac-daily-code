package loan;

public class Model {
    private Model(){};

    public static Loan getHomeLoan(double principle,int period){
        return new HomeLoan(principle, period);
    }

    public static Loan getPersonalLoan(double principle,int period){
        return new PersonalLoan(principle, period);
    }
}
