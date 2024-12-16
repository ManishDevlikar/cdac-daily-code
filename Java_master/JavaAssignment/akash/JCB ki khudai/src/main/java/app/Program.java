package app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Program {

    public static void main(String[] args) throws Exception {

        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@//iitdac.met.edu/xe", "dac2", "dac2");
        Statement stmt = con.createStatement();
        if (args.length == 0) {
            ResultSet rs = stmt.executeQuery("Select empno, ename, job, mgr, hiredate from emp");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + "   " + rs.getString(2) + "   " + rs.getString(3) + "    "
                        + rs.getInt(4) + "   " + rs.getDate(5));
            }
        } else {
            int deptID = Integer.parseInt(args[0]);
            ResultSet rs = stmt.executeQuery("Select empno, ename, job, mgr, hiredate from emp where deptno =" + deptID);

            boolean deptExists = false;
            
               
                while (rs.next()) {
                    deptExists = true;
                    System.out.println(rs.getInt(1) + "   " + rs.getString(2) + "   " + rs.getString(3) + "    "
                            + rs.getInt(4) + "   " + rs.getDate(5));
                }

                if (!deptExists) {
                    System.out.println("Department " + deptID +" does not exists" );
                }
            
        }
    }
}
