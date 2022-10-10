import java.io.BufferedReader;
import java.sql.*;
import java.util.Scanner;

public class s4b {
   static final String DB_URL = "jdbc:mysql://localhost/demo";
   static final String USER = "root";
   static final String PASS = "";

   public static void main(String[] args) {
      // Open a connection
      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();
      ) {		      
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter information of Customer.");
         
         System.out.println("Enter ID of Customer.");
         Integer id=sc.nextInt();
         
         System.out.println("Enter Contact_No of Customer.");
         Integer phno=sc.nextInt();
         
         
         System.out.println("Enter Name of Customer.");
         String nm=sc.next();
         
         
         
         System.out.println("Enter Address of Customer.");
         String add=sc.next();
         
         sc.close();
         PreparedStatement pst=conn.prepareStatement("insert into CUSTOMER values(?,?,?,?)");
         pst.setInt(1,id);
         pst.setString(2,nm);
         pst.setString(3,add);
         pst.setInt(4,phno);
         int n=pst.executeUpdate();
         if(n>0)
         {
              System.out.println("Record is Inserted");
         }
         else            {
             System.out.println("Error");
         }

         conn.close();
      } catch (SQLException e) {
         e.printStackTrace();
      } 
   }
}