using Payroll;

class Program
{
    static double Tax(Employee emp)
    {
        double i = emp.MonthlyIncome();
        return i > 10000 ? 0.15 * (i - 10000) : 0;
    }

    static void Main()
    {
        Employee jack = new Employee();
        jack.DaysWorked = 23;
        jack.DailyWages = 424;
        Console.WriteLine("Jack's income is {0:0.00}, tax is {1:0.00}", jack.MonthlyIncome(), Tax(jack));
        SalesPerson jill = new SalesPerson(184, 53, 62000);
        Console.WriteLine("Jill's income is {0:0.00}, tax is {1:0.00}", jill.MonthlyIncome(), Tax(jill));
    }
}