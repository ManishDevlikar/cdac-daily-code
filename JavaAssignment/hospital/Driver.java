import hospital.BedType;
import hospital.InHousePatient;
import hospital.Patient;

public class Driver {
    public static void main(String[] args) {
        Patient patient = new InHousePatient(1,"manish",3,2.4,BedType.General);
        var val=patient.getBill();
        System.out.println(val);
    }
}
