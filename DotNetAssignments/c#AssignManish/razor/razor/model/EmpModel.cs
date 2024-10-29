using System;
using System.Collections.Generic;
using razor.dbcontext;
using Microsoft.EntityFrameworkCore;
using razor.entities;
using System.Linq;

namespace razor.model
{
    public class EmpModel
    {
// ----------------------------------------Display All Department-----------------------------------------------------------------
        public void DisplayAllDepartments(){
            using var context = new EfDbContext();
            var Department = context.Departments.ToList();
            foreach (var item in Department){
                Console.WriteLine(item.Name);
            }
        }
//--------------------------------------------------------------------------------------------------------------------------------

// ----------------------------------------Display All Employee By Department Number-----------------------------------------------------------------
        public void DisplayAllEmployees(decimal deptId){
            using var context = new EfDbContext();
            var Dept = context.Departments.Include(d=>d.Employees).FirstOrDefault(d=>d.Id == deptId);
            foreach (var item in Dept.Employees){
                Console.WriteLine($"{item.Id,-5} | {item.Name,-10} | {item.Job,-10} | {item.mgr,-5} | {item.Sal,-8:C} | {item.Comm,-8} | {item.HireDate:yyyy-MM-dd} | {item.DepartmentId,-5}");
            }
        }
//--------------------------------------------------------------------------------------------------------------------------------

// ----------------------------------------Insert New Employee-----------------------------------------------------------------
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
//--------------------------------------------------------------------------------------------------------------------------------


// ----------------------------------------Insert New Department-----------------------------------------------------------------
        public void AddDepartment(int Id,string Name,string Location){
            var context = new EfDbContext();
            var dept=new Department{Id=Id,Name=Name,Location=Location};
            context.Departments.Add(dept);
            context.SaveChanges();
        }

//--------------------------------------------------------------------------------------------------------------------------------

/*
public IEnumerable<Visitor> GetVisitors()
    {
        using var site = new SiteDbContext();
        var selection = from t in site.Travelers
                        where t.Id.Length > 3
                        select new Visitor 
                        {
                            Name = t.Id,
                            Visits = t.Tours.Count,
                            Recent = t.Tours.Max(e => e.Checkin),
                            Stars = new string('*', t.Rating)
                        };
        return selection.ToList();
    }

*/

// -----------------------------------------Fetch All Employees-----------------------------------------------------------------
       public IEnumerable<WorkforceHero> GetAllEmployees(){
            var context = new EfDbContext();
            var departments=context.Departments.Include(d=>d.Employees).ToList();


            var employees = departments.SelectMany(department=>department.Employees.Select(emp=> new WorkforceHero(
                Id:emp.Id,
                Name:emp.Name,
                Job:emp.Job,
                Sal:emp.Sal,
                DeptNo:emp.DepartmentId
            )));
            return employees.ToList();
       }
//--------------------------------------------------------------------------------------------------------------------------------
    }
}