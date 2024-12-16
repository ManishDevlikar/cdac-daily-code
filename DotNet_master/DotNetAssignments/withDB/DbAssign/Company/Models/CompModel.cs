using System;
using Company.Data;
using Microsoft.EntityFrameworkCore;

namespace Company.Models
{
    public class CompModel
    {
        public void saveEmployee(int id,string name,double salary,int departmentId){
            using var contex = new SiteDbContex();

            var department = contex.dept.Find(departmentId);

            if(department == null){
                Console.WriteLine("Department Not Found");
                return;
            }

            var employee = new Employee{
                Id=id,
                Name=name,
                Salary=salary,
                DepartmentId=departmentId,
                Dept = department
            };
            contex.Add(employee);
            contex.SaveChanges();
            Console.WriteLine("saved");
        }

          public void SaveDepartment(int id, string name){
            using var context = new SiteDbContex();

            var department = new Department
            {
                Id = id,
                Name = name
            };

            context.dept.Add(department);
            context.SaveChanges();

            Console.WriteLine("saved");
        }

        public void displayAllDept(){
            using var contex = new SiteDbContex();
            var departments = contex.dept.ToList();
            foreach (var dept in departments)
            {
                Console.WriteLine(dept.Name);
            }
        }

        public void displayEmployees(int deptId){
            using var context = new SiteDbContex();

            var department = context.dept.Include(d=>d.Employees).FirstOrDefault(d=>d.Id==deptId);

            foreach(var emp in department.Employees){
                Console.WriteLine(emp.Name);
            }
        }
    }

}