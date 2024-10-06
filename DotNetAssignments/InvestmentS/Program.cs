using System;

class Program
{
    static void Main(string[] args)
    {
    
        double principal = 10000;  
        float rate = 5.5f;          
        int period = 2;             
        double interest = Investment.CalculateInterest(principal, rate, period);

     
        Console.WriteLine($"The interest on a principal of {principal} at a rate of {rate}% for {period} years is: {interest}");
    }
}
