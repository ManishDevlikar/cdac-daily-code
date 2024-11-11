package app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Program {
    
    public static void main(String[] args) throws Exception {

        Connection con = DriverManager.getConnection("jdbc:mysql://dac37.local/sales", "root", "password");
        Statement stmt = con.createStatement();
        if(args.length == 0){
            ResultSet rs = stmt.executeQuery("select pno, price, stock from products");
            while(rs.next())
                System.out.printf("%-6d%12.2f%8d%n", rs.getInt(1), rs.getDouble(2), rs.getInt("stock"));
            rs.close();
        }else{
            int id = Integer.parseInt(args[0]);
            ResultSet res = stmt.executeQuery("select pno, price,stock from products where pno=" + id);
            while(res.next())
                System.out.printf("%-6d%12.2f%8d%n", res.getInt(1), res.getDouble(2), res.getInt("stock"));
            res.close();
        }
        stmt.close();
        con.close();
    }

}

