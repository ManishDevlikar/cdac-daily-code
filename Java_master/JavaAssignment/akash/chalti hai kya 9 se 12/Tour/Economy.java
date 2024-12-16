package Tour;

public class Economy{

    private int noOfPerson;
    private int days;

    public Economy(int noOfPerson, int days) {
        this.noOfPerson = noOfPerson;
        this.days = days;
    }

    public void setNoOfPerson(int noOfPerson) {
        this.noOfPerson = noOfPerson;
    }

    public int getNoOfPerson() {
        return noOfPerson;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public int getDays() {
        return days;
    }

        @LuxuryTax    
        public double getDaysRent(int noOfPerson, int days) {
        if(days >= 6 || noOfPerson >= 4) {
        return 400 * getNoOfPerson() * getDays() / getDays();
        }
        
        return 500 * getNoOfPerson() * getDays() / getDays();
        
    }

}