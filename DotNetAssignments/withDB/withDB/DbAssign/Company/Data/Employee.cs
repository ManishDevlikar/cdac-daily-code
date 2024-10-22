using System;

namespace Company.Data
{
    public class Employee
    {
        public int Id { get; set; }
        public string Name {get;set;}
        public double Salary {get;set;}
        public int DepartmentId {get;set;}
        public Department Dept {get;set;}
    }
}