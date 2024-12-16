namespace efcore.Models;
public class EmpModel{

public void DisplayAllEmployees(decimal deptId)
{
        using var employee = new SiteDBcontext();
        var employees = employee.Employees.Include(e => e.Employee).FirstOrDefault(d => d.Id == deptId);
}
public void AddEmp(decimal deptId, decimal empno, string name, string job, decimal mgr, DateTime date, decimal salary,decimal comm)
{
    using (var db = new EfDbContext())
    {
    
        employee.Departments.Find(deptId);
        if(deptId != null)
        {var employee= new Employee
        {
            DepartmentId = deptId,
            Empno = empno,
            Name = name,
            Job = job,
            Mgr = mgr,
            Hiredate = date,
            Salary = salary,
            Comm = comm
        };
        employee.Add(employee);
        employee.SaveChanges();
        }
        else
         Console.WriteLine("Department not found");
        
    }
}
}
