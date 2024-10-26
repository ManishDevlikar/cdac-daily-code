// See https://aka.ms/new-console-template for more information
using System;
using efcore.model;
using efcore.dbcontext;

public class Program{
    public static void Main(string[] args){

        Console.WriteLine("Hello, World!");

        EmpModel model = new EmpModel();

        model.DisplayAllDepartments(); 
        model.DisplayAllEmployees(10);
            //deptId empno  ename  job  mgr  hiredate   sal  comm 
            //decimal deptId, decimal empno, string name, string job, decimal mgr, DateTime date, decimal salary,decimal comm
        // model.AddEmployee(10, 7999, "John", "Developer",7499, DateTime.Now.AddYears(-2), 5000, 500);
    }
}