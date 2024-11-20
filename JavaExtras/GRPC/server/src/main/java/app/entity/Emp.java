package app.entity;

import java.util.Date;

import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="EMP")
public class Emp{
    @Id
    // @GeneratedValue(strategy=GenerationType.IDENTITY)
    public double empno;
    public String ename;
    public double sal;
    public Date hiredate;
    public int mgr;
    public String job;
    public double comm;
    public double deptno;
}