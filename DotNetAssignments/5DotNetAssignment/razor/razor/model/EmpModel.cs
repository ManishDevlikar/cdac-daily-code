using System;
using System.Collections.Generic;
using razor.dbcontext;
using Microsoft.EntityFrameworkCore;
using razor.entities;
using System.Linq;
using System.Threading.Tasks;

namespace razor.model
{
    public class EmpModel
    {
// ----------------------------------------Display All Department-----------------------------------------------------------------
        public async Task<List<Department>> DisplayAllDepartments(){
            using var context = new EfDbContext();
            var Department = await context.Departments.ToListAsync();
            return Department;
        }
//--------------------------------------------------------------------------------------------------------------------------------

// ----------------------------------------Display All Employee By Department Number-----------------------------------------------------------------
        public async Task<List<WorkforceHero>> DisplayAllEmployees(decimal deptId){
            using var context = new EfDbContext();
            var Dept = await context.Departments.Include(d=>d.Employees).FirstOrDefaultAsync(d=>d.Id == deptId);
            return Dept?.Employees.Select(e=> new WorkforceHero{
                    Id = e.Id,
                    Name = e.Name,
                    Job = e.Job,
                    Sal = e.Sal,
                    DeptNo = e.DepartmentId
            }).ToList()?? new List<WorkforceHero>();
        }
//--------------------------------------------------------------------------------------------------------------------------------

// ----------------------------------------Insert New Employee-----------------------------------------------------------------
       public async Task AddEmployee(decimal deptId, string name, string job, decimal mgr, DateTime date, decimal salary,decimal comm){
            var context = new EfDbContext();
            var dept = await context.Departments.FindAsync(deptId);

            if (dept != null)
            {
            context.ChangeTracker.Clear(); 
            var allEmp = await GetAllEmployeesAsync();  
            // Get the last employee by ID and increment
            var lastEmp = allEmp.OrderByDescending(e => e.Id).FirstOrDefault();
            var empno = lastEmp != null ? lastEmp.Id + 1 : 1;

            // Create and add new employee
            var emp = new Employee
            {
                DepartmentId = deptId,
                Id = empno,
                Name = name,
                Job = job,
                mgr = mgr,
                HireDate = date,
                Sal = salary,
                Comm = comm
            };
             context.Add(emp);
             await context.SaveChangesAsync();
        }
        else
        {
            Console.WriteLine("Department not found");
        }
        }


//--------------------------------------------------------------------------------------------------------------------------------


// ----------------------------------------Insert New Department-----------------------------------------------------------------
        public async Task AddDepartment(decimal Id,string Name,string Location){
            var context = new EfDbContext();
            var dept=new Department{Id=Id,Name=Name,Location=Location};
            context.Departments.Add(dept);
           await context.SaveChangesAsync();
        }

//--------------------------------------------------------------------------------------------------------------------------------


// -----------------------------------------Fetch All Employees-----------------------------------------------------------------

     public async Task<IEnumerable<WorkforceHero>> GetAllEmployeesAsync()
    {
        using var context = new EfDbContext();
        var departments = await context.Departments.Include(d => d.Employees).ToListAsync(); 

        var employees = departments.SelectMany(department => department.Employees.Select(emp => new WorkforceHero(
            Id: emp.Id,
            Name: emp.Name,
            Job: emp.Job,
            Sal: emp.Sal,
            DeptNo: emp.DepartmentId
        )));

        return employees; 
    }
//--------------------------------------------------------------------------------------------------------------------------------
    }
}