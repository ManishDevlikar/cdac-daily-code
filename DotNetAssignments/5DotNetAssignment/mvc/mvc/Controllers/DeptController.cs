using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using Microsoft.Extensions.Logging;
using mvc.model;

namespace mvc.Controllers
{
    public class DeptController : Controller
    {
        private readonly EmpModel model;
        // constructor Injector
        public DeptController(EmpModel empModel)
        {
            model = empModel;
        }
        [HttpGet]
        public IActionResult Departments()
        {
            var departments=model.DisplayAllDepartments();
            return View(departments);
        }

       public IActionResult Register(){
        return View();
       }

       [HttpPost]
       public IActionResult Register(decimal Id,string Name,string Location){
            model.AddDepartment(Id,Name,Location);
            return RedirectToAction("Departments");
       }

        [HttpGet] 
        public IActionResult EmployeeByDept(decimal deptId){
            var employees=model.DisplayAllEmployees(deptId);
            var DeptEmp = new DeptEmpView{
                DeptId=deptId,
                Employees=employees
            };
            return View(DeptEmp);
        }
    }
}