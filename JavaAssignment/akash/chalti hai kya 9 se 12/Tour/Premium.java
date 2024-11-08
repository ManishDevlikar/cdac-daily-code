package Tour;

public class Premium {
    
    private int noOfPerson;
    private int days;

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

    public double getRentCommon() {
        if(days >= 6 || noOfPerson >= 4) {
            return 1100 * getDays() * getNoOfPerson();
        }
        return 1200 * getDays() * getNoOfPerson();
    }

    public double getRentSenior() {
        if(days >= 6 || noOfPerson >= 4) {
            return 1000 * getDays() * getNoOfPerson();
    }
    return 1100 * getDays() * getNoOfPerson();
    }

    public double getRentWomen() {
        if(days >= 6 || noOfPerson >= 4) {
            return 900 * getDays() * getNoOfPerson();
    }
    return 1000 * getDays() * getNoOfPerson();
    }


}
