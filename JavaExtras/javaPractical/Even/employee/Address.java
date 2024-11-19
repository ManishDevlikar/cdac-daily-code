package employee;


import java.util.*;

public class Address {

    public static List<Employee> employees = new ArrayList<>();

     public void addEmployee(Employee newEmployee) {
        for (Employee employee:employees){
            if (employee.getEid() == newEmployee.getEid()){
                System.out.println("Employee with same ID already exists");
                return;
            }
        }
        employees.add(newEmployee);
     }

     public void removeEmployee(int eid) {
        for (Employee employee : employees){
            if (employee.getEid() == eid){
                employees.remove(employee);
                break;
            }
        }
     }

     public Employee getEmployee(int eid) {
         for (Employee employee : employees){
             if (employee.getEid() == eid){
                 return employee;
             }
         }
         return null;
     }
}
