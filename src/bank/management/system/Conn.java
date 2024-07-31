package bank.management.system;

/**
 *
 * @author aarav
 */

import java.sql.*;

public class Conn {
    
    Connection c;
    Statement s;
    
    public Conn() {
        try {
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root","aarav");
            s = c.createStatement();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
