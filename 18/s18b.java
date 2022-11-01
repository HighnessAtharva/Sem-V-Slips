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
            String query = "insert into students2 values(?,?,?)";
            PreparedStatement ps = conn.prepareStatement(query);
            System.out.println("Enter roll no : ");
            int id = Integer.parseInt(br.readLine());
            System.out.println("Enter name : ");
            String name = br.readLine();
            System.out.println("Enter per : ");
            int percentage = Integer.parseInt(br.readLine());
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