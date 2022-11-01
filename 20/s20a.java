/*Write a JDBC program to count the number of records in table. (Without using standard method)	 */

import java.sql.*;

class s20a {
    static final String DB_URL = "jdbc:mysql://localhost/demo";
    static final String USER = "root";
    static final String PASS = "";

    public static void main(String args[]) {
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                Statement stmt = conn.createStatement();) {

            System.out.println("Connection Established......");
            ResultSet rs = stmt.executeQuery("select * from employees");

            int cnt = 0;
            while (rs.next()) {
                cnt++;
            }
            System.out.println("Number of records in Table are:" + cnt);

        } catch (Exception e) {
            System.out.println(e);

        }
    }
}