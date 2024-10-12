namespace loanapp{


public sealed class PersonalLoan : Loan,ITaxable{
     internal PersonalLoan(long principle,int period):base(principle,period){}

         public override float GetRate(){
            return (principle<=500000)?0.15f:0.16f;
        }  

        public double getTax(double amount){
            return amount*=1.1;
        } 
    }

}