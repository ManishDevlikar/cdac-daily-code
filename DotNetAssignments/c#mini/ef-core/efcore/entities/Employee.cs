namespace efcore.entities;

public class Employee{
    //empno  ename  job  mgr  hiredate   sal  comm  deptno 
    public decimal Id { get; set; }
    public string Name { get; set; }
    public string Job { get; set; }
    public decimal mgr { get; set; }
    public DateTime HireDate { get; set; }
    public decimal Sal { get; set; }
    public decimal Comm { get; set; }
    // Navigation property
    public Department Department { get; set; }

    // One-to-Many relationship with Department
    public int DepartmentId { get; set; }


}