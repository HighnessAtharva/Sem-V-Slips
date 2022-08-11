import java.io.BufferedReader;
import java.sql.*;
import java.util.Scanner;

public class s12a {
   static final String DB_URL = "jdbc:mysql://localhost/demo";
   static final String USER = "root";
   static final String PASS = "";
   static final String QUERY="CREATE TABLE Teacher(TNo int, TName varchar(20), Sal int, Desg varchar(20))";

   public static void main(String[] args) {
      // Open a connection
      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();
      ) {		
        int tno,sal;
        String tname,desg;      
        Scanner sc=new Scanner(System.in);
        
       
        stmt.executeUpdate(QUERY);
        System.out.println("Table Created");
        System.out.println("Enter Tno");
        tno=sc.nextInt();
        System.out.println("Enter Tname");
        tname=sc.next();
        System.out.println("Enter Sal");
        sal=sc.nextInt();
        System.out.println("Enter Desg");
        desg=sc.next();
        stmt.executeUpdate("insert into Teacher values("+tno+",'"+tname+"',"+sal+",'"+desg+"')");
        System.out.println("Record added successfully");
        sc.close();
        conn.close();
      } catch (SQLException e) {
         e.printStackTrace();
      } 
   }
}