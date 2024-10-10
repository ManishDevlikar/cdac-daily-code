namespace loanapp{


    public static class LoanFactory
    {
        public static Loan getPersonalLoan(long principle,int period){
            return new PersonalLoan(principle,period);
        }

        public static Loan getHomeLoan(long principle,int period){
            return new HomeLoan(principle,period);
        }

    }

}