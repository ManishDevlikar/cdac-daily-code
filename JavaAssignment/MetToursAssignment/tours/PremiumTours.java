package tours;

@LuxuryTax(10)
public class PremiumTours {
    private int days;
    private int noOfPersons;

    public PremiumTours(int days,int noOfPersons){
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

    public double getPerDayRentForCommon(int days,int noOfPersons){
        int perDayRentForCommon=(1200*noOfPersons)*days;
        double daysDiscountedRent=(days>6)?perDayRentForCommon-(100*days)*noOfPersons:perDayRentForCommon;
        double personDiscountedRent=(noOfPersons>=4)?perDayRentForCommon-(100*days)*noOfPersons:perDayRentForCommon;
        if(days>6 && noOfPersons>=4){
            return perDayRentForCommon-(daysDiscountedRent+personDiscountedRent);
        }else if(days>6){
            return perDayRentForCommon-daysDiscountedRent;
        }else if(noOfPersons>=4){
            return perDayRentForCommon-personDiscountedRent;
        }
        return perDayRentForCommon;
    }

    public double  getPerDayRentForSeniors(int days,int noOfPersons){
        int seniorDiscount=100*days;
        int perDayRentForSeniors=((1200*noOfPersons)*days)-seniorDiscount;
        double daysDiscountedRent=(days>6)?perDayRentForSeniors-(100*days)*noOfPersons:perDayRentForSeniors;
        double personDiscountedRent=(noOfPersons>=4)?perDayRentForSeniors-(100*days)*noOfPersons:perDayRentForSeniors;
        if(days>6 && noOfPersons>=4){
            return perDayRentForSeniors-(daysDiscountedRent+personDiscountedRent);
        }else if(days>6){
            return perDayRentForSeniors-daysDiscountedRent;
        }else if(noOfPersons>=4){
            return perDayRentForSeniors-personDiscountedRent;
        }
        return perDayRentForSeniors;
    }

    public double getPerDayRentForWoman(int days,int noOfPersonsense){
        int womanDiscount=200*days;
        int perDayRentForWoman=((1200*noOfPersons)*days)-womanDiscount;
        double daysDiscountedRent=(days>6)?perDayRentForWoman-(100*days)*noOfPersons:perDayRentForWoman;
        double personDiscountedRent=(noOfPersons>=4)?perDayRentForWoman-(100*days)*noOfPersons:perDayRentForWoman;
        if(days>6 && noOfPersons>=4){
            return perDayRentForWoman-(daysDiscountedRent+personDiscountedRent);
        }else if(days>6){
            return perDayRentForWoman-daysDiscountedRent;
        }else if(noOfPersons>=4){
            return perDayRentForWoman-personDiscountedRent;
        }
        return perDayRentForWoman;
    }

}