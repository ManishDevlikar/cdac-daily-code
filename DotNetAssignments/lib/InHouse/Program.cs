using hospital;

class Program{

    public static double getTax(Patient patient) {
        double bill=patient.getBillAmount(patient);
        double tax=0;
        if(bill>5000 && bill<10000)
            tax=0.05;
        else if(bill>10000)
            tax=0.1;
        return tax*bill;
    }

    public static void Main(string[] args){

    Patient patient = new Patient("saas",30,BedType.Vip);
    InHousePatient inHousePatient = new InHousePatient("react",25,BedType.Vip,5);


    Console.WriteLine($"PatientID: {patient.PatientID}, Patient Name: {patient.PatientName}, Bed Type: {patient.bedType}");
    Console.WriteLine($"PatientID: {inHousePatient.PatientID}, Patient Name: {inHousePatient.PatientName}, Bed Type: {inHousePatient.bedType}");


   double bill1= patient.getBillAmount(patient);
   double bill2= inHousePatient.getBillAmount(inHousePatient);


   Console.WriteLine($"Patient Bill: {bill1}, Tax Amount: {getTax(patient)} Total Amount: {bill1 + getTax(patient)}");
   Console.WriteLine($"InHousePatient Bill: {bill2}, Tax Amount: {getTax(inHousePatient)} Total Amount: {bill2 + getTax(inHousePatient)}");
    } 

}