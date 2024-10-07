using System;

class Program
{
	//a parameter declared with 'ref' keyword expects 
	//the reference (location) of the argument instead 
	//of a copy of its value
	static void Advise(ref Investment inv)
	{
		inv.AllowRisk(inv.TotalPayment() < 500000);
	}

	//a parameter declared with 'out' keyword accepts reference to
	//an unitialized argument so that the method can initialize it
	static bool TryGoldPlus(int years, out Investment result)
	{
		if(years < 3)
		{
			result = default; //new Investment();
			return false;
		}
		result = new Investment(100000, years);
		if(years < 5)
			result.AllowRisk(RiskLevel.High);
		else if(years < 10)
			result.AllowRisk(RiskLevel.Low);
		return true;
		
	}

	static void Main(string[] args)
	{
		Console.WriteLine("Welcome Investor!");
		if(args.Length > 1)
		{
			double p = double.Parse(args[0]);
			int n = int.Parse(args[1]);
			Investment myinv = new Investment(p, n);
			Console.WriteLine("Future value of risk-free investment: {0:0.00}", myinv.FutureValue());
			myinv.AllowRisk(true);
			Console.WriteLine("Future value of riskful investment  : {0:0.00}", myinv.FutureValue());
			Advise(ref myinv); //passing reference of myinv instance
			Console.WriteLine("Future value of smart investment    : {0:0.00}", myinv.FutureValue());
			myinv.AllowRisk(RiskLevel.High);
			Console.WriteLine("Future value of high-risk investment: {0:0.00}", myinv.FutureValue());
		}
		else if(args.Length == 1)
		{
			int n = int.Parse(args[0]);
			if(TryGoldPlus(n, out Investment myinv))
				Console.WriteLine("Future value of gold-plus investment: {0:0.00}", myinv.FutureValue());
		}
	}
}

