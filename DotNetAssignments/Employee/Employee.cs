using System;
public enum EmployeeType{Trainee,Frontend,Backend,Fullstack};
public struct Employee{
	private int id;
	private double salary;
	private double comm;
	private int age;
	static int count;
	EmployeeType employeeType;


	public Employee(double sal,double c,int a){
		id=++count;
		salary=sal;
		comm=c;
		age=a;
		employeeType=EmployeeType.Trainee;
	}

	public double GetIncome(){
		return salary+comm;
	}

	public void setEmployeeType(EmployeeType empType){
		this.employeeType=empType;
	}

	public void PrintEmployee(){
		Console.WriteLine($"Employee Age: {this.age} Employee income {this.GetIncome()} Employee Id {this.id} Employee Type {this.employeeType}");
	
	}

	public static Employee CreateEmployee(out Employee emp,int age,double sal,double comm){
		emp = new Employee();
		emp.id=++count;
		emp.age= age;
		emp.salary=sal;
		emp.comm=comm;
		emp.employeeType=EmployeeType.Trainee;
		return emp;
	} 
	public static void IncreaseSal(ref Employee employee,double salaryToIncrease){
		EmployeeType empType = employee.employeeType;
		switch (empType){
			case EmployeeType.Trainee:
			employee.salary+=salaryToIncrease;
			break;
			case EmployeeType.Frontend:
			employee.salary+=salaryToIncrease;
			break;
			case EmployeeType.Backend:
			employee.salary+=salaryToIncrease;
			break;
			case EmployeeType.Fullstack:
			employee.salary+=salaryToIncrease;
			break;
			default:
			Console.WriteLine("Invalid Employee Type");
			break;
		}
	}
}
