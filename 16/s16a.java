/*Write a JDBC program for implementation absolute() and relative() methods of ResultSet. Consider Emp table  */

import java.sql.*;

public class s16a {
    static final String DB_URL = "jdbc:mysql://localhost/demo";
    static final String USER = "root";
    static final String PASS = "";

    public static void main(String[] args) throws ClassNotFoundException {

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);) {
            // Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            // Connection conn = DriverManager.getConnection("jdbc:odbc:Test");
            String select_query = "select * from employees";
            ResultSet rs = stmt.executeQuery(select_query);

            // Moving the cursor to point previous row of third row
            rs.absolute(3);
            System.out.println("Cursor is pointing at 3rd row");
            System.out.println("THIRD ROW \n EMP NUM = " + rs.getInt(1) + "\n LAST NAME = " + rs.getString(2) + "\n FIRST NAME = " + rs.getString(3));

            // Moving the cursor to point to one row before the current row
            rs.relative(-1);
            System.out.println("Cursor is pointing to the 1 row previous to the 3rd row");
            System.out.println("Second ROW \n EMP NUM = " + rs.getInt(1) + "\n LAST NAME = " + rs.getString(2) + "\n FIRST NAME = " + rs.getString(3));

            // Moving the cursor to point 4th row after the 2nd row
            rs.relative(4);
            System.out.println("Cursor is pointing to the 4th row after the 2nd row");
            System.out.println("SIXTH ROW \n EMP NUM = " + rs.getInt(1) + "\n LAST NAME = " + rs.getString(2) + "\n FIRST NAME = " + rs.getString(3));

            // Moving the cursor to point current row
            System.out.println(" Current Row = " + rs.getRow());
        }

        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}