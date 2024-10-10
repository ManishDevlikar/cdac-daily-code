namespace loanlib;

public class PersonalLoan : Loan
{
     public override double Rate (int amount)
     {
        return amount <= 500000 ? 0.15 : 0.16;
     }
}