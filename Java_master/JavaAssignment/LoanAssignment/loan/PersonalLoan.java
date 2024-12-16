package loan;
public class PersonalLoan extends Loan implements Taxable{
    
    public PersonalLoan(double principle,int period){
        super(principle,period);
    }

    @Override
    public double getRate() {
        return super.getPrinciple()<=500000?0.15:0.16;
    }

    @Override
    public double getTax(double amount) {
       return amount*0.10;
    }

}
