/*Write a java program for implementation scrollable ResultSet. Consider Emp table (eno ename, sal)
-	moveFirst
-	moveNext
-	movePrevious
-	moveLast   	*/

import java.sql.*;
import java.util.*;

class s5a {
    static final String DB_URL = "jdbc:mysql://localhost/demo";
    static final String USER = "root";
    static final String PASS = "";

    public static void main(String args[]) {
        // important to use the TPYE_SCROLL_INSENSITIVE and CONCUR_UPDATEABLE
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);

            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);) {
            ResultSet rs = null;
            int ch;
            Scanner s = new Scanner(System.in);

            rs = stmt.executeQuery("select * from employees");
            int count = 0;
            while (rs.next())
                count++;
            System.out.println("Which Record u want");
            System.out.println("Records are = " + count);
            do {
                System.out.println("1 First \n2 last \n3 next \n4 prev \n0 Exit");
                ch = s.nextInt();
                switch (ch) {
                    case 1:
                        rs.first();
                        System.out.println("Roll :" + rs.getInt(1) + " Name :" + rs.getString(2));
                        break;
                    case 2:
                        rs.last();
                        System.out.println("Roll :" + rs.getInt(1) + " Name :" + rs.getString(2));
                        break;
                    case 3:
                        rs.next();
                        if (rs.isAfterLast())
                            System.out.println("can't move forward");
                        else
                            System.out.println("Roll :" + rs.getInt(1) + " Name :" + rs.getString(2));
                        break;
                    case 4:
                        rs.previous();
                        if (rs.isBeforeFirst())
                            System.out.println("can't move backward");
                        else
                            System.out.println("Roll :" + rs.getInt(1) + " Name :" + rs.getString(2));
                        break;
                    case 0:
                        break;
                    default:
                        System.out.println("Enter valid operation");
                }// switch
            } while (ch != 0);
        } // end of try
        catch (Exception e) {
            System.out.println(e);
        }
    }// main
}// c