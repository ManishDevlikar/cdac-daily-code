package loan;

public abstract class Loan {
    private double principle;
    private double duration;

    public Loan(double principle, double duration) {
        this.principle = principle;
        this.duration = duration;
    }

    public void setPrinciple(double amount) {
        this.principle = amount;
    }

    public double getPrinciple() {
        return principle;
    }

    public void setDuration(double months) {
        this.duration = months;
    }

    public double getDuration() {
        return duration;
    }

    public abstract double getRate();

    public double getEMI() {
        return getPrinciple() * (1 + getRate() * getDuration() / 100)/(12*getDuration());
    } 

}