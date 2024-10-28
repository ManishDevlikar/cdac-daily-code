using System.ComponentModel.DataAnnotations.Schema;

namespace efcore.data;

[Table("EMPLOYEES45")]
public class Employee
{
    [Column("empno")]
    public decimal Id { get; set; }
    [Column("ename")]
    public string Name { get; set; }
    [Column("Job")]
    public string Job { get; set; }
    [Column("mgr")]
    public decimal Mgr { get; set; }
    [Column("Hire Date")]
    public DateTime Hiredate { get; set; }
    [Column("Salary")]
    public decimal Salary { get; set; }
    [Column("Comm")]
    public decimal Comm { get; set; }

    [ForeignKey("Department45")]
    [Column("deptno")]
    public decimal DepartmentId { get; set; }
}