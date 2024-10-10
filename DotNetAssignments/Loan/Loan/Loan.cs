namespace loanlib;

public abstract class Loan
{
    public int Principle { get; set;}
    public float Period { get; set;}
    public abstract double Rate (int amount);
    public double Emi ()
    {
        // emi = p * (1 + r * n / 100) / (12 * n)
        return Principle*(1+Rate(Principle)*Period/100)/(12*Period);
    }
}