package patient;

import java.util.Scanner;

public class CommonPatient {
    private int patientId;
    private String patientName;
    private int noOfDays;
    private BedType bedType;

    public CommonPatient(int patientId, String patientName, int noOfDays, BedType bedType) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.noOfDays = noOfDays;
        this.bedType = bedType;
    }
    
    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public int getNoOdDays() {
        return noOfDays;
    }

    public void setNoOfDays(int noOfDays) {
        this.noOfDays = noOfDays;
    }

    public BedType getBedType() {
        return bedType;
    }

    public void setBedType(BedType bedType) {
        this.bedType = bedType;
    }

    public double getBillAmount() {
        System.out.println("Do you want to change your bed type? Y/N");
        Scanner sc = new Scanner(System.in);
        String input = sc.next().toUpperCase();
        double bill = 0;
        if (input.equals("Y")) {
            System.out.println("Enter your choice");
            System.out.println("1-> select General Bed");
            System.out.println("2-> select VIP Bed");
            System.out.println("3-> select ICU Bed");
            Scanner scanner =new Scanner(System.in);
            int choice=sc.nextInt();
            double totalAmout=0;

            switch (choice) {
                case 1:
                    totalAmout = noOfDays * BedType.ECONOMY.getCost();
                    break;
                case 2:
                    totalAmout = noOfDays * BedType.STANDARD.getCost();
                    break;
                case 3:
                    totalAmout = noOfDays * BedType.LUXURY.getCost();
                    break;
                default:
                    System.out.println("Invalid choice");
                    return 0;
            }

            return totalAmout;
        }
        else if (input.equals("N")){
            return this.noOfDays * this.bedType.getCost();
        }
        return 0;

    }

};