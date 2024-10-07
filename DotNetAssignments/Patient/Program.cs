

using System.Runtime.Serialization;

namespace PatientService;

class Program{

    public static void Main(string[] args){

    Patient patient = new Patient("saas",5,BedType.Vip);
    InHousePatient inHousePatient = new InHousePatient("react",5,BedType.Vip,5);


    Console.WriteLine($"PatientID: {patient.PatientID}, Patient Name: {patient.PatientName}, Bed Type: {patient.bedType}");


   double bill1= patient.getBillAmount(patient);
   double bill2= inHousePatient.getBillAmount(inHousePatient);
   double bill3= patient.getBillAmount(inHousePatient);

   Console.WriteLine($"Patient Bill: {bill1}, ");
   Console.WriteLine($"InHousePatient Bill: {bill2}, ");
   Console.WriteLine($"InHousePatient Without Discount: {bill3}, ");
    } 

}