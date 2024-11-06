package tours;
public class EconomyTours {
    private int days;
    private int noOfPersons;

    public EconomyTours(int days,int noOfPersons){
        this.days = days;
        this.noOfPersons = noOfPersons;
    }

    public void setDays(int days){
        this.days=days;
    }

    public void setNoOfPersons(int noOfPersons){
        this.noOfPersons=noOfPersons;
    }

    public int getDays(){
        return this.days;
    }

    public int getNoOfPersons(){
        return this.noOfPersons;
    }

    public double getDaysRent(int days,int noOfPersons){
        double totalRent= (500*days)*noOfPersons;
        double daysDiscountedRent=(days>6)?totalRent-(100*days)*noOfPersons:totalRent;
        double personDiscountedRent=(noOfPersons>=4)?totalRent-(100*days)*noOfPersons:totalRent;
        double finalRent=0;
        if(days>6 && noOfPersons>=4)
            return finalRent-(daysDiscountedRent+personDiscountedRent);
        else if(days>6)
            return finalRent-daysDiscountedRent;
        else if(noOfPersons>=4)
            return finalRent-personDiscountedRent;
        else 
            return finalRent;
    }

}
