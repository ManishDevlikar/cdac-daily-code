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
    }
}