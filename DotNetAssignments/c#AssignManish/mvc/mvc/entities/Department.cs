using System.ComponentModel.DataAnnotations.Schema;
using System.Collections.Generic;
using System;
namespace mvc.entities;
[Table("DEPARTMENT45")]
public class Department{
    [Column("deptno")]
    public decimal Id { get; set; }
    [Column("dname")]
    public string Name { get; set; }
    [Column("loc")]
    public string Location { get; set; }
    public List<Employee> Employees { get; set; } = new List<Employee>();
}