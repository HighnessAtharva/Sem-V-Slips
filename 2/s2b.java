import java.sql.*;

public class s2b {
    static final String DB_URL = "jdbc:mysql://localhost/demo";
    static final String USER = "root";
    static final String PASS = "";

    public static void main(String arg[]) {
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                Statement stmt = conn.createStatement();) {

            ResultSet rs = stmt.executeQuery("Select id, last_name, first_name, salary from employees");
            System.out.println(" EID " + " Last Name " + " First Name " + " Salary ");
            while (rs.next()) {
                System.out.print(rs.getInt(1) + "\t");
                System.out.print(rs.getString(2) + "\t");
                System.out.print(rs.getString(3) + "\t");
                System.out.print(rs.getInt(4) + "\t");
                System.out.print("\n");
            }
            String s = "delete from employees where first_name like 'A%'";
            int n = stmt.executeUpdate(s);
            if (n > 0)  {
                System.out.println("Record is Deleted...!!!");
            } else {
                System.out.println("Record is not found in table...!!!");
            }
            ResultSet rs1 = stmt.executeQuery("Select id, last_name, first_name, salary from employees");
            System.out.println(" EID " + " Last Name " + " First Name " + " Salary ");
            while (rs1.next()) {
                System.out.print(rs1.getInt(1) + "\t");
                System.out.print(rs1.getString(2) + "\t");
                System.out.print(rs1.getString(3) + "\t");
                System.out.print(rs1.getInt(4) + "\t");
                System.out.print("\n");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}