namespace loanlib;

public class HomeLoan : Loan
{
     public override double Rate (int amount)
     {
        return amount <= 2000000 ? 0.10 : 0.11;
     }

}