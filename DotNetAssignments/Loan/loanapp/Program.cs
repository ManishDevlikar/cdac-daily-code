using loanlib;

Loan jill = new PersonalLoan();

jill.Principle = 600000;

jill.Period = 3;

double jillRoi = jill.Rate(jill.Principle)  ;

double EMI = jill.Emi();

Console.WriteLine($"Jill's Personal EMI is {EMI}");
