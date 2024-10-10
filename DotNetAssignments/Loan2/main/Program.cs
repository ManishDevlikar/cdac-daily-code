using loanapp;

class Program{

    static void Main(string[] args){

        Loan p1=LoanFactory.getPersonalLoan(5000000,3);
        Loan h1=LoanFactory.getHomeLoan(5000000,3);

        double emi1=p1.getEMI();
        double emi2=h1.getEMI();

        Console.WriteLine($"personal Emi is {emi1}");
        Console.WriteLine($"home Emi is {emi2}");
    }

}