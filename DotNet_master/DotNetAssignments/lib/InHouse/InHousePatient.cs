using hospital;


  class InHousePatient : Patient
    {
        public double discount;
            
             public InHousePatient(string name,int noOfDays, BedType bedType, double discount ) : base(name, noOfDays, bedType)
        {
            this.discount = discount/100;
        }



        public override double getBillAmount(Patient p)
        {
            return base.getBillAmount(p) - (base.getBillAmount(p) * discount);
        }

    }