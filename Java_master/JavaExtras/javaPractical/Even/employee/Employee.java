package employee;

public class Employee{
    
    private String fname;
    private String lname;
    private int eid;

    public Employee(String fname, String lname, int eid){
        this.fname = fname;
        this.lname = lname;
        this.eid = eid;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    @Override
    public String toString(){
        return "Employee Name: " + fname + " " + lname + ", Employee ID: " + eid;
    }

}