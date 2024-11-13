package app;

import java.util.ArrayList;
import java.util.List;

import app.data.Employee;
import app.model.EmployeeModel;

public class Program {

    public static void main(String[] args) throws Exception {

        System.out.println("----------------------------------------------");

        if (args.length == 0) {
            EmployeeModel model = new EmployeeModel();
            List<Employee> employees = new ArrayList<>();
            employees.addAll(model.getEmployees());
            for (Employee emp : employees) {
                System.out.println(emp.getEmpno() + "  " + emp.getEname() + "  " + emp.getHiredate().toString() + "  "
                        + emp.getDepartment().getDeptno());
            }
        } else if (args.length == 1) {
            int deptID = Integer.parseInt(args[0]);
            EmployeeModel model = new EmployeeModel();
            List<Employee> list = new ArrayList<>();
            list.addAll(model.getEmployeeByDepartment(deptID));
            for (Employee emp : list) {
                System.out.println(emp.getEmpno() + "  " + emp.getEname() + "  " + emp.getHiredate().toString() + "  "
                        + emp.getDepartment().getDeptno());
            }
        } else {

            int empId = Integer.parseInt(args[1]);
            EmployeeModel model2 = new EmployeeModel();
            Employee emp1 = model2.getEmployeeById(empId);
            System.out.println(emp1.getEmpno() + "  " + emp1.getEname() + "  " + emp1.getHiredate().toString() + "  "
                    + emp1.getDepartment().getDeptno());
        }
    }
}
