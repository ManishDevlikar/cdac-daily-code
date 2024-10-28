using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using api.model;

namespace api.Controllers
{
    [ApiController]
    public class SiteController : ControllerBase
    {
        
        private readonly EmpModel model;

        public SiteController(EmpModel empModel){
            model = empModel;
        }

        [HttpGet("heroes")]   
        public IActionResult ReadWorkforceHeroes(EmpModel model){
            var Heroes = model.GetAllEmployees();
            if(Heroes.Any()){
                return Ok(Heroes);
            }
            return NotFound();
        }

        [HttpPost("heroes")]
        public IActionResult AddWorkforceHero(decimal deptId, decimal empno, string name, string job, decimal mgr, DateTime date, decimal salary,decimal comm){
            model.AddEmployee(deptId, empno, name, job, mgr, date, salary,comm);
            return Ok();
        }

        [HttpGet("heroes/{deptId}")]
        public IActionResult GetEmployeesByDept(decimal deptId, EmpModel model){
            var Heroes = model.DisplayAllEmployees(deptId);
            if(Heroes.Any()){
                return Ok(Heroes);
            }
            return NotFound();
        }
    }
}