package loan;
public class HomeLoan extends Loan implements Discountable{

    public HomeLoan(double principal,int period){
        super(principal,period);
    }

    @Override
    public double getRate() {
        return super.getPrinciple()<=2000000?0.1:0.11;
    }

    @Override
    public double getDiscount(double amount) {
        return amount*0.05;
    }

    
}
