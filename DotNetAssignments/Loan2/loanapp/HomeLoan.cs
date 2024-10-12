namespace loanapp {

sealed public class HomeLoan : Loan,IDiscountable{
        private double approvedAmount;
        internal HomeLoan(long principle,int period):base(principle,period){
            this.approvedAmount=3000000;
        }

        public override float GetRate(){
            // return (principle<=2000000)?0.10f:0.11f;

            float rate=0.0f;
            if(principle<=2000000){
                rate=0.10f;
            }else{
                rate=0.11f;
            }
            if(principle>=approvedAmount){
                rate+=0.1f;
            }
            return rate;
        }

        public double getDiscount(double amount){
            return amount*=0.5;
        }
    }

}