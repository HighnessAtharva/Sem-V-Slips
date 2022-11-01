import java.sql.*;

public class s3b {
   static final String DB_URL = "jdbc:mysql://localhost/demo";
   static final String USER = "root";
   static final String PASS = "";
   static final String QUERY = "SELECT * FROM employees where department='Computer Science'";

   public static void main(String[] args) {
      // Open a connection
      try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();) {
         ResultSet rs = stmt.executeQuery(QUERY);
         while (rs.next()) {
            // Display values
            System.out.println("ID: " + rs.getInt("id"));
            System.out.println("First: " + rs.getString("first_name"));
            System.out.println("Last: " + rs.getString("last_name"));
            System.out.println("Department: " + rs.getString("department"));
            System.out.println("Salary: " + rs.getFloat("salary"));
            System.out.println("Email: " + rs.getString("email"));
            System.out.println("----------");

         }
         rs.close();
      } catch (SQLException e) {
         e.printStackTrace();
      }
   }
}