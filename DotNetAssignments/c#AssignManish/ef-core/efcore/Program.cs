// See https://aka.ms/new-console-template for more information
using System;
using efcore.model;
using efcore.dbcontext;

public class Program{
    public static void Main(string[] args){

        EmpModel model = new EmpModel();

        // model.DisplayAllDepartments(); 
        // model.DisplayAllEmployees(10);
        // model.DisplayAllEmployees();
            //deptId empno  ename  job  mgr  hiredate   sal  comm 
            //decimal deptId, decimal empno, string name, string job, decimal mgr, DateTime date, decimal salary,decimal comm
        // model.AddEmployee(10, 7999, "John", "Developer",7499, DateTime.Now.AddYears(-2), 5000, 500);
        // model.AddDepartment(50,"HR","Mumbai");

        while(true){
        Console.WriteLine("Press 1 -> to list all employees");
        Console.WriteLine("Press 2 -> to list all departments");
        Console.WriteLine("Press 3 -> to add new Employee");
        Console.WriteLine("Press 4 -> to add new Department");
        Console.WriteLine("Press 5 -> to see employees form any department");
        Console.WriteLine("Press 6 -> to Exit");
        Console.WriteLine("Enter Your Choice");
        int choice = Convert.ToInt32(Console.ReadLine());
        switch (choice)
        {
            case 1:
            model.DisplayAllEmployees();
            break;
            case 2:
            model.DisplayAllDepartments();
            break;
            case 3:
            
            Console.Write("Enter Department ID: ");
            decimal deptId = decimal.Parse(Console.ReadLine() ?? "0");

            Console.Write("Enter Employee Number: ");
            decimal empNo = decimal.Parse(Console.ReadLine() ?? "0");

            Console.Write("Enter Employee Name: ");
            string name = Console.ReadLine() ?? "";

            Console.Write("Enter Job Title: ");
            string job = Console.ReadLine() ?? "";

            Console.Write("Enter Manager ID (or 0 if none): ");
            decimal mgr = decimal.Parse(Console.ReadLine() ?? "0");

            Console.Write("Enter Hire Date (yyyy-mm-dd): ");
            DateTime hireDate = DateTime.Parse(Console.ReadLine() ?? DateTime.Now.ToString("yyyy-MM-dd"));

            Console.Write("Enter Salary: ");
            decimal salary = decimal.Parse(Console.ReadLine() ?? "0");

            Console.Write("Enter Commission (or 0 if none): ");
            decimal comm = decimal.Parse(Console.ReadLine() ?? "0");

            model.AddEmployee(deptId, empNo, name, job, mgr, hireDate, salary, comm);
            break;
            case 4:

            Console.Write("Enter Department ID: ");
            var depno = int.Parse(Console.ReadLine() ?? "0");

            Console.Write("Enter Department Name: ");
            var dname = Console.ReadLine() ?? "";

            Console.Write("Enter Department Location: ");
            var dlocation = Console.ReadLine() ?? "";

            model.AddDepartment(depno,dname,dlocation);
            break;
            case 5:
            Console.WriteLine("Enter Dept number :");
            var dId=decimal.Parse(Console.ReadLine());
            model.DisplayAllEmployees(dId);
            break;
            case 6:
            Console.WriteLine("visit again");
            return;
            default:
            Console.WriteLine("Invalid Input To Exit press 6");
            break;
        }
        }

    }
}