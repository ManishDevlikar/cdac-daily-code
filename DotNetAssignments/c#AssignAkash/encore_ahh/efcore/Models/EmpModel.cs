namespace efcore.Models;

public void AddEmp(decimal deptId, decimal empno, string name, string job, decimal mgr, DateTime date, decimal salary,decimal comm)
{
    using (var db = new EfDbContext())
    {
        
        var employee = new Employee
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
        employee.Add(emp);
        employee.SaveChanges();
        }
        else
         Console.WriteLine("Department not found");
        
    }
}