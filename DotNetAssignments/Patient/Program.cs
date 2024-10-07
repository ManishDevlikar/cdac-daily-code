namespace PatientService;

class Program{

    public static double getTax(Patient patient) {
        double bill=patient.getBillAmount(patient);
        double tax=0;
        if(bill>1000 && bill<=2000)
            tax=0.1;
        else if(bill>2000 && bill<=3000)
            tax=0.15;
        else if(bill>3000)
        tax=0.2;
        return tax*bill;
    }

    public static void Main(string[] args){

    Patient patient = new Patient("saas",15,BedType.Vip);
    InHousePatient inHousePatient = new InHousePatient("react",15,BedType.Vip,5);


    Console.WriteLine($"PatientID: {patient.PatientID}, Patient Name: {patient.PatientName}, Bed Type: {patient.bedType}");


   double bill1= patient.getBillAmount(patient);
   double bill2= inHousePatient.getBillAmount(inHousePatient);
   double bill3= patient.getBillAmount(inHousePatient);

   Console.WriteLine($"Patient Bill: {bill1}, Tax Amount: {getTax(patient)}");
   Console.WriteLine($"InHousePatient Bill: {bill2}, Tax Amount: {getTax(patient)}");
   Console.WriteLine($"InHousePatient Without Discount: {bill3}, Tax Amount: {getTax(patient)}");
    } 

}