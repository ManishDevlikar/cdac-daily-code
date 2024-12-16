package app.model;

import java.util.List;

import app.data.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EmployeeModel {

    public Employee getEmployeeById(int id) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("app.data");
        EntityManager em = factory.createEntityManager();
        return em.find(Employee.class, id);

    }
    public List<Employee> getEmployees() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("app.data");
        EntityManager em = factory.createEntityManager();
        return em.createQuery("Select e From Employee e", Employee.class).getResultList();
    }

    public List<Employee> getEmployeeByDepartment(int deptID) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("app.data");
        EntityManager em = factory.createEntityManager();
        return em.createQuery("Select e from Employee e where e.department.deptno = :deptid", Employee.class)
        .setParameter("deptid", deptID)
        .getResultList();
    }
}
