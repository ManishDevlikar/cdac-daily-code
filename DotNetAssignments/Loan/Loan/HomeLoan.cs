namespace loanlib;

public class HomeLoan : Loan, IDiscountable
{
     public override double Rate (int amount)
     {
        return amount <= 2000000 ? 0.10 : 0.11;
     }

     public double CalculateDiscount(double amount)
     {
       return  amount * 0.95;
     }

}