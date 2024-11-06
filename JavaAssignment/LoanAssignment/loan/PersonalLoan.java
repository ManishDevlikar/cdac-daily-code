package loan;
public class PersonalLoan extends Loan{
    
    public PersonalLoan(double principle,int period){
        super(principle,period);
    }

    @Override
    public double getRate() {
        return super.getPrinciple()<=500000?0.15:0.16;
    }

}
