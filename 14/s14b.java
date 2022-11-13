// Write a program to execute a batch of SQL statements in Java.

import java.sql.*;

public class s14b {
   static final String DB_URL = "jdbc:mysql://localhost/demo";
   static final String USER = "root";
   static final String PASS = "";

   public static void main(String[] args) throws Exception {
      try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS); Statement stmt = conn.createStatement();) {
         
         ResultSet rs = stmt.executeQuery("select * from employees");
         rs.last();
         System.out.println("rows before batch execution= " + rs.getRow());
         
         
         stmt.addBatch("insert into employees values(100,'jay','trainee', 'A@gmail.com', 'dept1', 10000)");
         stmt.addBatch("insert into employees values(1265,'jayes','trainee', 'B@gmail.com', 'dept1', 10000)");
         stmt.addBatch("insert into employees values(565,'shail','trainee', 'C@gmail.com', 'dept1', 10000)");
         stmt.executeBatch();

         System.out.println("Batch executed");
         rs = stmt.executeQuery("select * from employees");
         rs.last();
         System.out.println("rows after batch execution = " + rs.getRow());
      } catch (Exception e) {
         System.out.println(e);
      }
   }
}
