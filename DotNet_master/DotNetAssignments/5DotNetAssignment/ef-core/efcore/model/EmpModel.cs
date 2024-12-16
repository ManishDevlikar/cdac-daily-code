using System;
using efcore.dbcontext;
using Microsoft.EntityFrameworkCore;
using efcore.entities;

namespace efcore.model
{
    public class EmpModel
    {
        public void DisplayAllDepartments(){
            using var context = new EfDbContext();
            var Department = context.Departments.ToList();
            foreach (var item in Department){
                Console.WriteLine(item.Name);
            }
        }

        public void DisplayAllEmployees(decimal deptId){
            using var context = new EfDbContext();
            var Dept = context.Departments.Include(d=>d.Employees).FirstOrDefault(d=>d.Id == deptId);
            foreach (var item in Dept.Employees){
                Console.WriteLine($"{item.Id,-5} | {item.Name,-10} | {item.Job,-10} | {item.mgr,-5} | {item.Sal,-8:C} | {item.Comm,-8} | {item.HireDate:yyyy-MM-dd} | {item.DepartmentId,-5}");
            }
        }

    //empno  ename  job  mgr  hiredate   sal  comm  deptno 
        public void AddEmployee(decimal deptId, decimal empno, string name, string job, decimal mgr, DateTime date, decimal salary,decimal comm){
            var contex = new EfDbContext();
            var dept = contex.Departments.Find(deptId);
            if(dept!=null){
                var emp = new Employee{DepartmentId = deptId, Id = empno, Name = name, Job = job, mgr = mgr, HireDate = date, Sal = salary, Comm = comm};
                contex.Add(emp);
                contex.SaveChanges();
            }else{
                Console.WriteLine("Department not found");
            }
        }

        public void AddDepartment(int Id,string Name,string Location){
            var context = new EfDbContext();
            var dept=new Department{Id=Id,Name=Name,Location=Location};
            context.Departments.Add(dept);
            context.SaveChanges();
        }


        public void DisplayAllEmployees(){
            var context = new EfDbContext();
            var depts=context.Departments.Include(d=>d.Employees).ToList();
            foreach(var department in depts){
               Console.WriteLine("----------------------------------------------------------"); 
               Console.WriteLine($"Department Id: {department.Id,-5}  |  Department Name: {department.Name,-10}");
               Console.WriteLine("Employees Are :");
               
               foreach(var emp in department.Employees){
                Console.WriteLine($"{emp.Id,-5} | {emp.Name,-10} | {emp.Job,-10} | {emp.mgr,-5}  | {emp.Sal,-8:C} | {emp.Comm,-8} | {emp.HireDate:yyyy-MM-dd} | {emp.DepartmentId,-5}");
               }
               Console.WriteLine("----------------------------------------------------------"); 
            }
        }
    }
}