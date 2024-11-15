package app.data;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="DEPT")
public class Department {
    @Id
    // @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private double deptno;
    private String dname;
    private String loc;

    @OneToMany(mappedBy="department",cascade=CascadeType.ALL)
    private List<Employee> employees;

    public double getDeptno() {
        return deptno;
    }

    public void setDeptno(double deptno) {
        this.deptno = deptno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }


}
