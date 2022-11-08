/*Write a java program to create a student table with field’s rno, name and per. 
Insert values in the table. Display all the details of the student on screen. (Use PreparedStatement Interface)  */

import java.sql.*;
import java.io.*;

public class s18b {
    static final String DB_URL = "jdbc:mysql://localhost/demo";
    static final String USER = "root";
    static final String PASS = "";

    public static void main(String args[]) {
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                Statement stmt = conn.createStatement();) {
            
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            
            System.out.println("Enter roll no : ");
            int id = Integer.parseInt(br.readLine());
            System.out.println("Enter name : ");
            String name = br.readLine();
            System.out.println("Enter per : ");
            int percentage = Integer.parseInt(br.readLine());

            
            String query = "insert into students2 values(?,?,?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setInt(3, percentage);
            int no = ps.executeUpdate();
            if (no != 0)
                System.out.println("Data inserted succesfully.....");
            else
                System.out.println("Data not inserted");
            // display details
            ResultSet rs = stmt.executeQuery("select * from students2");
            System.out.println("id\t" + "name\t" + "percentage");
            while (rs.next()) {
                System.out.println("\n" + rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getInt(3));
            }
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}