package Tour;

public class Premium {
    
    private int noOfPerson;
    private int days;

    public Premium(int noOfPerson, int days) {
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

    @LuxuryTax(10)
    public double getRentCommon(int noOfPerson, int days) {
        if(days >= 6 || noOfPerson >= 4) {
            return 1100 * getDays() * getNoOfPerson() / getDays();
        }
        return 1200 * getDays() * getNoOfPerson() / getDays();
    }

    @LuxuryTax(10)
    public double getRentSenior(int noOfPerson, int days) {
        if(days >= 6 || noOfPerson >= 4) {
            return 1000 * getDays() * getNoOfPerson() / getDays();
    }
    return 1100 * getDays() * getNoOfPerson() / getDays();
    }

    @LuxuryTax(10)
    public double getRentWomen(int noOfPerson, int days) {
        if(days >= 6 || noOfPerson >= 4) {
            return 900 * getDays() * getNoOfPerson() / getDays();
    }
    return 1000 * getDays() * getNoOfPerson() / getDays();
    }


}
