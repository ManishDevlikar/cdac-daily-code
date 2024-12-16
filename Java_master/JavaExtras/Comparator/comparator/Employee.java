package comparator;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Employee{
    int id;
    double salary;
    String name;

    public Employee(int id,double salary,String name){
        this.id=id;
        this.salary=salary;
        this.name=name;
    }


    public static void main(String[] args) {
        Employee e1 = new Employee(1, 10000, "John");
        Employee e2 = new Employee(3, 20000, "Alice");
        Employee e3 = new Employee(2, 30000, "Bob");
        Employee e4 = new Employee(4, 40000, "Charlie");
        List<Employee> employees = new LinkedList<>();
    
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
    
    //   Collections.sort(employees,new IdComarator()); 
    
    System.out.println("----------Id Comparator");
    employees.sort(new IdComarator());
    employees.forEach(e->System.out.println(e.id+" "+e.name+" "+e.salary));
    System.out.println("----------Name Comparator");
    employees.sort(new NameComparator());
    employees.forEach(e->System.out.println(e.id+" "+e.name+" "+e.salary));
    System.out.println("----------Salary Comparator");
        employees.sort(new SalaryComparator());
        employees.forEach(e->System.out.println(e.id+" "+e.name+" "+e.salary));
    
    }
}

class IdComarator implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
        return Integer.compare(o1.id, o2.id);
    }
    
}

class SalaryComparator implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
        return Double.compare(o1.salary, o2.salary);
    }

    
}
class NameComparator implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.name.compareTo(o2.name);
    }
    
}  