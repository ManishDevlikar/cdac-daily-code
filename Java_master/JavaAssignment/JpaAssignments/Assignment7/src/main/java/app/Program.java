package app;

import java.util.ArrayList;
import java.util.List;

import app.employee.data.Employee;
import app.employee.model.EmployeeModel;

public class Program {
    
    public static void main(String[] args) throws Exception {
        if(args.length == 0) {
            EmployeeModel model = new EmployeeModel();

            List<Employee> list=new ArrayList<>();
            list.addAll(model.getEmployees());
            for(Employee employee : list){
                System.out.println(employee.getEmpno()+"     "+employee.getEname()+"     "+employee.getHiredate().toString()+"    "+employee.getDepartment().getDeptno());
            }
        }else{
            int deptId = Integer.parseInt(args[0]);
            EmployeeModel model = new EmployeeModel();
            List<Employee> list=new ArrayList<>();
            list.addAll(model.getEmployeeByDept(deptId));
            for(Employee employee : list){
                System.out.println(employee.getEmpno()+" "+employee.getEname()+" "+employee.getHiredate().toString());
            }
        }
    }
}

