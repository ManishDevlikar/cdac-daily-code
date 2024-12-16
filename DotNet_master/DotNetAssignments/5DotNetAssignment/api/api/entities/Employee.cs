using System.ComponentModel.DataAnnotations.Schema;
using System;
namespace api.entities;
[Table("EMPLOYEES45")]
public class Employee{
    //empno  ename  job  mgr  hiredate   sal  comm  deptno 
    [Column("empno")]
    public decimal Id { get; set; }
    //  [Required]
    [Column("ename")]
    public string Name { get; set; }
    //  [Required]
    [Column("job")]
    public string Job { get; set; }
    [Column("mgr")]
    public decimal mgr { get; set; }
    [Column("hiredate")]
    public DateTime HireDate { get; set; }
    [Column("sal")]
    public decimal Sal { get; set; }
    [Column("comm")]
    public decimal Comm { get; set; }
    // Navigation property
    public Department Department { get; set; }

    // One-to-Many relationship with Department
    [ForeignKey("department45")]
    [Column("deptno")]
    public decimal DepartmentId { get; set; }


}