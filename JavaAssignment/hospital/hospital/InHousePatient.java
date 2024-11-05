package hospital;

public class InHousePatient extends Patient{
    public double discount;

    public InHousePatient(int id,String name,int noOfDays,double discount,BedType bedType){
        super(id, name, noOfDays, bedType);
        this.discount=discount;
    }

    @Override
    public double getBill(){
        double totalAmoutWithoutDiscount=super.getBill();
        double totalDiscout=totalAmoutWithoutDiscount>=5000?totalAmoutWithoutDiscount*0.05:totalAmoutWithoutDiscount*1;
        System.out.println("Your discount is :"+totalDiscout);
        return totalAmoutWithoutDiscount-totalDiscout;
    }
}
