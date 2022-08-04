import java.sql.*;

public class s2b {
   static final String DB_URL = "jdbc:mysql://localhost/demo";
   static final String USER = "root";
   static final String PASS = "";
   static final String QUERY = "SELECT id, first_name, last_name, email FROM employees";

   public static void main(String[] args) {
      // Open a connection
      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();
      ) {		      
         String sql = "DELETE FROM employees WHERE first_name LIKE 'A%'";
         stmt.executeUpdate(sql);
         ResultSet rs = stmt.executeQuery(QUERY);
         while(rs.next()){
            //Display values
            System.out.print("ID: " + rs.getInt("id"));
            System.out.print(", First: " + rs.getString("first_name"));
            System.out.println(", Last: " + rs.getString("last_name"));

         }
         rs.close();
      } catch (SQLException e) {
         e.printStackTrace();
      } 
   }
}