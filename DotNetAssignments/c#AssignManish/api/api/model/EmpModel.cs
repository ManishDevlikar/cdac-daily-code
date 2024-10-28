using System;
using System.Collections.Generic;
using api.dbcontext;
using Microsoft.EntityFrameworkCore;
using api.entities;
using System.Linq;

namespace api.model
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
        public IEnumerable<WorkforceHero> DisplayAllEmployees(decimal deptId){
            using var context = new EfDbContext();
            var Dept = context.Departments.Include(d=>d.Employees).FirstOrDefault(d=>d.Id == deptId);
            
            var result = Dept.Employees.Select(e => new WorkforceHero(e.Id, e.Name, e.Job, e.Sal, e.DepartmentId));
            return result.ToList();
        }
//--------------------------------------------------------------------------------------------------------------------------------

// ----------------------------------------Insert New Employee-----------------------------------------------------------------
        public void AddEmployee(decimal deptId, decimal empno, string name, string job, decimal mgr, DateTime date, decimal salary,decimal comm){
            var contex = new EfDbContext();
            var dept = contex.Departments.Find(deptId);
            var getEmpId=GetAllEmployees();
            //get emp id incremeted by one from its last employee
            var lastEmp = getEmpId.OrderByDescending(e => e.Id).FirstOrDefault();
            if(lastEmp!=null) empno=lastEmp.Id+1;
            else empno=1;

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