package app.components;

public class SIBean {

    private double principle;

    private double rate;

    private int months;

    private double simple;

    public double getPrinciple() {
        return principle;
    }

    public void setPrinciple(double principle) {
        this.principle = principle;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getMonths() {
        return months;
    }

    public void setMonths(int months) {
        this.months = months;
    }

    public double getCalculateInterest() {
        simple=(getPrinciple() * getRate() * getMonths()/1200);
        return simple;
    }

}