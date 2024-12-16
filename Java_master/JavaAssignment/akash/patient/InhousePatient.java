package patient;

public class InHousePatient extends CommonPatient {
    public double discount;

    public InHousePatient(int patientId, String patientName, int noOfDays, BedType bedType, double discount) {
        super(patientId, patientName, noOfDays, bedType);
        this.discount = discount;
    }

    @Override
    public double getBillAmount() {
        return 0;
    }
}
