using razor.model;
using razor.entities;
using System.Linq;
using System.Collections.Generic;
using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.RazorPages;
using System.Threading.Tasks;
namespace razor.pageModel{
    public class EmployeeListModel : PageModel {
        public readonly EmpModel model;
        public List<WorkforceHero> employees {get;set;} = new List<WorkforceHero>();
        // public List<Department> departments {get;set;} = new List<Department>();


        public EmployeeListModel(EmpModel model){
            this.model = model ?? throw new ArgumentNullException(nameof(model));;
        }
        public async Task OnGetAsync(){
        employees = (await model.GetAllEmployeesAsync()).ToList();
        }

        public IActionResult OnGetAddEmployee(){
            return RedirectToPage("/AddEmployee");
        }

        public async Task<IActionResult> OnPostAddNewEmployee(decimal deptId, string name, string job, decimal mgr, DateTime date, decimal salary,decimal comm){
            await model.AddEmployee(deptId,name,job,mgr,date,salary,comm);
            return RedirectToPage("/EmployeeList");
        }
    } 
}

