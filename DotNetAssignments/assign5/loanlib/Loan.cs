namespace loan;

public abstract class Loan
{
    public double Principle { get; set; }
    public int Period { get; set; }

    public abstract getRate(double rate);

    public getEMI(double amount){
        // emi = p * (1 + r * n / 100) / (12 * n)
    }
}
