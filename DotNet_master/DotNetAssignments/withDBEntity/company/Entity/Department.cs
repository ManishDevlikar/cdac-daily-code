using System;
using System.ComponentModel.DataAnnotations.Schema;

namespace company.Entity
{
[Table("DepartmentInfo")]
    public class Department
    {
[Column("DepartmentId")]
        public int Id {get;set;}
        public string Name {get;set;}
        public List<Employee> Employees{get;set;}=new List<Employee>();
    }
}
