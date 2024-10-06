using System;
enum Employee{Frontend,Backend,Fullstack};
public struct Employee{
	private int id;
	private double salary;
	private double comm;
	private int age;
	static int count;


	public Employee(double sal,double c,int a){
		id=++count;
		salary=sal;
		comm=c;
		age=a;
	}

	public double GetIncome(){
		return salary+comm;
	}

	public void PrintEmployee(){
		Console.WriteLine($"Employee Age: {this.age} Employee income {this.GetIncome()} Employee Id {this.id}");
	
	}

	public static Employee CreateEmployee(out Employee emp,int age,double sal,double comm){
		emp = new Employee();
		emp.id=++count;
		emp.age= age;
		emp.salary=sal;
		emp.comm=comm;
		return emp;
	} 
	public void IncreaseSal(double sal){
		this.salary+=sal;
	}
}
