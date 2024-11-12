package app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Program {
    
    public static void main(String[] args) throws Exception {
        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@//iitdac.met.edu/xe","dac2","dac2");
        try { 
            if(args.length==0){
            
                    
                    Statement state=conn.createStatement();
                    ResultSet result= state.executeQuery("select * from emp");
                    while(result.next()){
                        System.out.println(result.getInt(1)+" "+result.getString(2)+" "+result.getString(3)+" "+result.getInt(4)+" "+result.getDate(5)+" "+result.getDouble(6)+" "+result.getDouble(7)+" "+result.getInt(8));
                    }
                
            }else{
                int dept=Integer.parseInt(args[0]);
                String query = "select * from emp where emp.deptno="+dept;
                Statement state=conn.createStatement();
                ResultSet result= state.executeQuery(query);
                while(result.next()){
                    System.out.println(result.getInt(1)+" "+result.getString(2)+" "+result.getString(3)+" "+result.getInt(4)+" "+result.getDate(5)+" "+result.getDouble(6)+" "+result.getDouble(7)+" "+result.getInt(8));

                }
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            conn.close();
        }
    }
}

