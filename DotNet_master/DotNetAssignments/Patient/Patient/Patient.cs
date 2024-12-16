using System;


namespace PatientService
{
public enum BedType
{
    Economical,
    Vip,
    Luxury
}
    class Patient{
        public int PatientID;
        public string PatientName { get; set; }
        static public int idCounter;
        public int NoOfDays { get; set; }

        public BedType bedType;

        public Patient(string name, int noOfDays, BedType bedType)
        {
            PatientName = name;
            PatientID = ++idCounter;
            NoOfDays = noOfDays;
            this.bedType = bedType;
        }
    public virtual double getBillAmount(Patient p){
        BedType bed= p.bedType;
        double billAmount = 0;
        switch(bed){
            case BedType.Economical:
                billAmount= NoOfDays * 100;
                break;
            case BedType.Vip:
              billAmount= NoOfDays * 200;
              break;
            case BedType.Luxury:
                  billAmount= NoOfDays * 300;
                  break;
            default:
                Console.WriteLine("Invalid bed type");
                break;
        }
        return billAmount;
    }

    }


}