namespace loanlib;

public class PersonalLoan : Loan, ITaxable 
{
     public override double Rate (int amount)
     {
        return amount <= 500000 ? 0.15 : 0.16;
     }

     public double CalculateTax(double amount)
     {
       return amount * 1.1;
     }
}