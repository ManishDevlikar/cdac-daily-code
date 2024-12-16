using System;

public struct Investment
{
    public static double CalculateInterest(double principal, float rate, int period)
    {
        return (principal * rate * period) / 100;
    }
}
