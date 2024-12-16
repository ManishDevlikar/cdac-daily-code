namespace  MetTours{

    [AttributeUsage(AttributeTargets.Class)]
    public class LuxuryTaxAttribute : Attribute
    {
        public int tax {get;set;}

        public LuxuryTaxAttribute(int value=8){
            tax=value;
        }
        
    }  
}