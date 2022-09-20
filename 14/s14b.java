import java.sql.*;

public class s14b{
    static final String DB_URL = "jdbc:mysql://localhost/demo";
   static final String USER = "root";
   static final String PASS = "";
   public static void main(String[] args) throws Exception {
    try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
    Statement stmt = conn.createStatement();
 ) {
      
      String insertEmp1 = "insert into employees values(16,'jay','trainee', 'A@gmail.com', 'dept1', 10000)";
      String insertEmp2 = "insert into employees values(17,'jayes','trainee', 'B@gmail.com', 'dept1', 10000)";
      String insertEmp3 = "insert into employees values(18,'shail','trainee', 'C@gmail.com', 'dept1', 10000)";
      conn.setAutoCommit(false);
      
      stmt.addBatch(insertEmp1);
      stmt.addBatch(insertEmp2);
      stmt.addBatch(insertEmp3);
      
      ResultSet rs = stmt.executeQuery("select * from employees");
      rs.last();
      System.out.println("rows before batch execution= "+ rs.getRow());
      stmt.executeBatch();
      conn.commit();
      
      System.out.println("Batch executed");
      rs = stmt.executeQuery("select * from employees");
      rs.last();
      System.out.println("rows after batch execution = "+ rs.getRow());
   }catch(Exception e){
        System.out.println(e);
     }
   }
} 
