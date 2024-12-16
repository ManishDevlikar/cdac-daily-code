using System.ComponentModel.DataAnnotations.Schema;
using System;


namespace company.Entity
{
    [Table("EmployeeInfo")]
    public class Employee
    {
        [column("EmployeeId")]
        public int Id {get;set;}
        public string Name { get; set; }
        public double Salary {get;set;}
        public int DepartmentId {get;set;}
        public Department Dept {get;set;}        
    }
}