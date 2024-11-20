package app.services;


import java.sql.Date;

import emps.EmpDept;
import app.entity.Emp;
import emps.EmpDept.DeptInput;
import emps.EmpDept.Employee;
import emps.EmpManagerGrpc.EmpManagerImplBase;
import io.grpc.stub.StreamObserver;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;


public class EmployeeService extends EmpManagerImplBase{
    private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("app.data");

    @Override
    public void fetchEmployees(DeptInput request,StreamObserver<Employee> responseObserver){
        try(EntityManager manager = factory.createEntityManager()){
            manager.createQuery("select e from Emp e where e.deptno=:deptno",Emp.class).setParameter("deptno", request.getDeptId()).getResultList()
            .forEach(employee ->{
            var message= Employee.newBuilder()
            .setEmpno(employee.empno)
            .setEname(employee.ename)
            .setMgr(employee.mgr)
            .setComm(employee.comm)
            .setDeptno((int) employee.deptno)
            .setHiredate(employee.hiredate.toString())
            .build();
            responseObserver.onNext(message);
            });
            responseObserver.onCompleted();
        }
    }
}
