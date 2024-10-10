namespace loanapp {

sealed public class HomeLoan : Loan{
    // long principle;int period;
        internal HomeLoan(long principle,int period):base(principle,period){}

        public override float GetRate(){
            return (principle<=2000000)?0.10f:0.11f;
        }
    }

}