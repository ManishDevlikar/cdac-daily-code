using loanapp;

class Program{

    static void Main(string[] args){

        Loan p1=LoanFactory.getPersonalLoan(50000,1);
        Loan h1=LoanFactory.getHomeLoan(50000,1);
        Loan p2=LoanFactory.getPersonalLoan(50000,1);
        Loan h2=LoanFactory.getHomeLoan(50000,1);

        double emi1=p1.getEMI();
        double emi2=h1.getEMI();

        Console.WriteLine($"personal Emi is {emi1.ToString("f2")}");
        Console.WriteLine($"home Emi is {emi2.ToString("f2")}");

        var totalDis= Utility.GetTotalDiscount(p1,h1,p2,h2);
        var totalTax= Utility.GetTotalTax(p1,h1,p2,h2);

        Console.WriteLine($"Home Loan Total Discount: {totalDis.ToString("f2")}");
        Console.WriteLine($"Personal Loan Total Tax: {totalTax.ToString("f2")}");
    }

}