
import java.sql.*;

class s16b {
    static final String DB_URL = "jdbc:mysql://localhost/demo";
    static final String USER = "root";
    static final String PASS = "";


    public static void main(String a[]) {
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                Statement stmt = conn.createStatement();) {

            int no = stmt.executeUpdate("alter table students drop column percentage");
            if (no != 0)
                System.out.println("Drop col sucessfully");
            else
                System.out.println("NOT Drop col ");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}