namespace loanapp{


public abstract class Loan{
   public long principle{get;set;}
   public int period {get; set;}

    internal Loan(long principle,int period){
        this.principle=principle;
        this.period=period;
    }

    public abstract float GetRate();

    public double getEMI(){
        // emi = p * (1 + r * n / 100) / (12 * n)
        return principle*(1+GetRate()*period/100)/(12*period);
    }
}

}