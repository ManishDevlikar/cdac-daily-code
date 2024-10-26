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
                Console.WriteLine($"{item.HireDate.ToString("yyyy MM dd")} {item.Name}");
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
    }
}