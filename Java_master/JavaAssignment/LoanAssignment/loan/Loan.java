package loan;

public abstract  class Loan{
    private double principle;
    private int period;
    
    public Loan(double principle, int period){
        this.principle = principle;
        this.period = period;
    }

    public double getPrinciple(){
        return this.principle;
    }
    
    public int getPeriod(){
        return this.period;
    }

    public void setPeriod(int period){
        this.period = period;
    }
    public void setPrinciple(double principal){
        this.principle = principal;
    }

    public abstract double getRate();

    public double getEMI(){
        //emi = p * (1 + r * n / 100) / (12 * n)
        return getPrinciple() * (1 + getRate() * getPeriod() / 100)/(12*getPeriod());
    }
}