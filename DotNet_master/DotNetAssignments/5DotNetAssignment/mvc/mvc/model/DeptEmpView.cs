using System.Collections.Generic;


namespace mvc.model{
   public class DeptEmpView{
        public decimal DeptId {get;set;}
        public IEnumerable<WorkforceHero> Employees {get;set;}
    } 
}