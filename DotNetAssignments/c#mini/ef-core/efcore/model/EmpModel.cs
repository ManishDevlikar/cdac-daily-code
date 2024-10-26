using System;
using efcore.dbcontext;
using Microsoft.EntityFrameworkCore;

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
                Console.WriteLine($"{item.Name}");
            }
        }
    }
}