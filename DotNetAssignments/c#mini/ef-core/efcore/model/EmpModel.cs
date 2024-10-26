using System;
using efcore.dbcontext;

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

        public void DisplayAllEmployees(){
            using var context = new EfDbContext();
            var employees = context.Employees.ToList();
            foreach (var item in employees){
                Console.WriteLine($"{item.Id} - {item.Name} - {item.Salary}");
            }
        }
    }
}