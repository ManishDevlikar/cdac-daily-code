namespace DemoApp.Services;

public class Compound : IInterest{

    public double  GetInterest(double principal, double rate, double time)
    {
        return (principal * Math.Pow((1 + rate / 100), time)) - principal;
    }
}