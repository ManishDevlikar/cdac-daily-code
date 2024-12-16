using System;

public class Program{

	public static void Main(String[] args){
	
	      Employee emp1 = new Employee(1234,200,78);
	      double income = emp1.GetIncome();

	      Console.WriteLine($"total income:{income}");
	      emp1.PrintEmployee();

	      Employee emp2;
	      Employee.CreateEmployee(out emp2,int.Parse(args[0]),double.Parse(args[1]),double.Parse(args[2]));

	      emp2.PrintEmployee();
		  emp2.setEmployeeType(EmployeeType.Fullstack);
		  emp2.PrintEmployee();
		  Employee.IncreaseSal(ref emp2,2000);	
	}

}
