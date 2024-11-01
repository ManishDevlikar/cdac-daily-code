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
    public class HomeController : Controller
    {

        private readonly EmpModel model;
        // constructor Injector
        public HomeController(EmpModel empModel)
        {
            model = empModel;
        }


        public IActionResult Index()
        {
            var workforceHero = model.GetAllEmployees();
            return View(workforceHero);
            // return View();
        }

        public IActionResult Register(){
            return View();
        }
        [HttpPost]
        public IActionResult Register(decimal deptId, decimal empno, string name, string job, decimal mgr, DateTime date, decimal salary,decimal comm){
            model.AddEmployee(deptId, empno, name, job, mgr, date, salary,comm);
            return RedirectToAction("Index");
        }
    }
}