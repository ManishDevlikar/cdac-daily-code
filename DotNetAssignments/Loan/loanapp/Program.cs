using loanlib;

Loan jill = new PersonalLoan();

jill.Principle = 600000;

jill.Period = 3;

double jillRoi = jill.Rate(jill.Principle)  ;

double EMI = jill.Emi();

Console.WriteLine($"Jill's Personal EMI is {EMI}");

ITaxable jilltax = jill as ITaxable;
var val=jilltax.CalculateTax(EMI);

Console.WriteLine($"Jill's Personal Tax is {val}");

Loan jack = new HomeLoan();

jack.Principle = 1500000;

jack.Period = 10;

double jackRoi = jack.Rate(jack.Principle);

double JackEmi = jack.Emi();

Console.WriteLine($"Jack's Home Loan EMI is {JackEmi}");

IDiscountable jackdis = jack as IDiscountable;

double val1=jackdis.CalculateDiscount(JackEmi);

Console.WriteLine($"Jack's Home Loan discount is {val}");

Loan john = new PersonalLoan();

john.Principle = 12000;

john.Period = 1;

john.Rate(john.Principle);

double JohnEmi = john.Emi();

Console.WriteLine($"John's Personal EMI is {JohnEmi}");

ITaxable johnTax = john as ITaxable;

double val2=johnTax.CalculateTax(JohnEmi);

Console.WriteLine($"John's Personal Tax is {val2}");

Loan jane = new HomeLoan();

jane.Principle = 300000;

jane.Period = 2;

double JaneRoi = jane.Rate(jane.Principle);

double JaneEmi = jane.Emi();

Console.WriteLine($"Jane's Home Loan EMI is {JaneEmi}");

IDiscountable janeTax = jane as IDiscountable;

double val3=janeTax.CalculateDiscount(JaneEmi);

Console.WriteLine($"Jane's Home Loan discount is {val}");

double GetTotalTax(params Loan[] loans) 
{
    double total=0;
    foreach (var loan in loans)
    {
        ITaxable taxable = loan as ITaxable;
        if (taxable!= null)
        {
            total += taxable.CalculateTax(loan.Emi());
        }
    }
    return total;
}

Console.WriteLine($"Total tax is {GetTotalTax(jill,john,jack)}");