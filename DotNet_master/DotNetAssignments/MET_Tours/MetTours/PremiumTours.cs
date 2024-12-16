namespace MetTours;

[LuxuryTax(10)]
public class PremiumTours{
public double getPerDayRentForCommon(int days , int noPersons){
    return (1200*noPersons)*days;
}
public double getPerDayRentForSeniors(int days , int noPersons){
    double totalRent=(1200*noPersons)*days;
    double seniorDiscountedRent=totalRent-(100*days);
   return (days>6 || noPersons>=4)?seniorDiscountedRent-(100*days)*noPersons:seniorDiscountedRent;

}
public double getPerDayRentForWoman(int days , int noPersons){
    double totalRent=(1200*noPersons)*days;
    double womanDiscountedRent=totalRent-(200*days);
   return (days>6 || noPersons>=4)?womanDiscountedRent-(100*days)*noPersons:womanDiscountedRent;
}
}