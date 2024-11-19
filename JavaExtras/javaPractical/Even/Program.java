import employee.Address;
import employee.Employee;

public class Program {
    
    public static void main(String[] args) {
        var e1 = new Employee("Shubham", "Gule", 1);
        var e2 = new Employee("Darshan", "M", 2);
        var e3 = new Employee("Manyaa", "Devlikar", 3);

        var book = new Address();
        book.addEmployee(e1);
        book.addEmployee(e2);
        book.addEmployee(e3);

        for (Employee emp : Address.employees) {
            System.out.println(emp);
        }

        book.removeEmployee(2);
        for(Employee emp : Address.employees) {
            System.out.println(emp);
        }

        System.out.println(book.getEmployee(3));
    }
}
