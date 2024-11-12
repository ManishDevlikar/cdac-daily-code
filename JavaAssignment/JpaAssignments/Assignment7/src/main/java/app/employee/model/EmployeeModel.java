package app.employee.model;

import java.util.List;

import app.employee.data.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EmployeeModel {
   

   public Employee getEmployeeById(int id) {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("app.data");
     EntityManager em = factory.createEntityManager();
      return em.find(Employee.class, id);
   }

   public List<Employee> getEmployees(){
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("app.data");
    EntityManager em = factory.createEntityManager();

     return em.createQuery("SELECT e FROM Employee e", Employee.class).getResultList();
   }

   public List<Employee> getEmployeeByDept(int deptId){
     EntityManagerFactory factory = Persistence.createEntityManagerFactory("app.data");
     EntityManager em = factory.createEntityManager();
     return em.createQuery("SELECT e FROM Employee e where e.department.deptno = :deptId",Employee.class).setParameter("deptId",deptId).getResultList();
   }
}
