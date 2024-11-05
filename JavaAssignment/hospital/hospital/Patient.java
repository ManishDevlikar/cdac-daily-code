package hospital;
import java.util.Scanner;

public abstract class Patient {
    int id;
    String name;
    BedType bedType;
    int noOfDays;

    public Patient(int id,String name,int noOfDays,BedType bedType){
        this.id=id;
        this.name=name;
        this.bedType=bedType;
        this.noOfDays=noOfDays;
    }

    public void changeBedType(BedType bedType){
        this.bedType=bedType;
    }

    public double calculateBill(){
        return this.noOfDays*this.bedType.getCost();
    }


    public double getBill(){
        System.out.println("Enter your choice");
        System.out.println("1-> select General Bed");
        System.out.println("2-> select VIP Bed");
        System.out.println("3-> select ICU Bed");
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        double totalAmout=0;

        switch (choice) {
            case 1:
                totalAmout=this.noOfDays*BedType.General.getCost();
                break;
            case 2:
                totalAmout = this.noOfDays*BedType.VIP.getCost();
                break;
            case 3:
                totalAmout=this.noOfDays*BedType.ICU.getCost();
            default:
                System.out.println("Enter valid chice");
                break;
        }

        return totalAmout;
    }
}

