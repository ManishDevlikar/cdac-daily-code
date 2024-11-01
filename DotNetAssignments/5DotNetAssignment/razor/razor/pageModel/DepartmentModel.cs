using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.RazorPages;
using razor.entities;
using razor.model;
using System.Collections.Generic;
using System.Threading.Tasks;

namespace razor.pageModel{
    public class DepartmentModel : PageModel{
        public readonly EmpModel model;
        public List<Department> departments {get;set;} = new List<Department>();
        public List<WorkforceHero> workforceHeroes {get;set;} = new List<WorkforceHero>();
         [BindProperty] 
        public decimal deptId { get; set; } 

        public DepartmentModel(EmpModel model){
            this.model = model;
        }

        public async Task OnGetAsync(){
            departments = await model.DisplayAllDepartments();
        }

        public async Task OnGetAllDepartment()
        {
            departments = await model.DisplayAllDepartments();
        }

        public IActionResult OnGetAddDepartment(){
            return RedirectToPage("/AddDepartment");
        }

        public async Task<IActionResult> OnPostAddNewDepartment(Decimal Id,string Name,string Location){
            await model.AddDepartment(Id,Name,Location);
            return RedirectToPage("/DepartmentList");
        }

       public async Task OnPostEmployeeByDepartment(){
         workforceHeroes=await model.DisplayAllEmployees(deptId);
       }

    }
}