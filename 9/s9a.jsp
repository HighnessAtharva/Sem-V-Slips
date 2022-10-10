<!-- <%@ page language="java" import="java.sql.*" %>
    <!DOCTYPE html>
    <html>

    <body>
        <%! int hno; String hname, address; %>
            <% 
            String DB_URL="jdbc:mysql://localhost/demo" ; 
            String USER="root"; 
            String PASS="" ; 
            try(Connection conn=DriverManager.getConnection(DB_URL, USER, PASS);
            Statement st=conn.createStatement();){ 
                ResultSet rs=st.executeQuery("select * from Hospital"); %>
                <table border="1" width="40%">
                    <tr>
                        <td>Hospital No</td>
                        <td>Name</td>
                        <td>Address</td>
                    </tr>
                    <% while(rs.next()) { %>
                        <tr>
                            <td>
                                <%= rs.getInt("number") %>
                            </td>
                            <td>
                                <%= rs.getString("name") %>
                            </td>
                            <td>
                                <%= rs.getString("address") %>
                        </tr>
                        <% } conn.close(); }catch(Exception e) { out.println(e); } %>
    </body>

    </html> -->



<!-- TRY THIS PORGRAM IN THE COLLEGE  LAB -->
<%@ page language="java" import="java.sql.*" %>
    <%! int i=0; %>
        <%! Connection con; %>
            <%! ResultSet rs; %>

                <% 
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver"); 
con=DriverManager.getConnection("jdbc:odbc:mydsn); 
st= con.createStatement(); 
rs=st.executeQuery("select * from hospital"); 
%>

                    <table border="2">
                        <th>HNO</th>
                        <th>HNAME</th>
                        <th>ADDRESS</th>
                        <% while(rs.next()) { %>
                            <tr>
                                <td>
                                    <%= rs.getInt(1) %>
                                </td>
                                <td>
                                    <%= rs.getString(2) %>
                                </td>
                                <td>
                                    <%= rs.getString(3) %>
                                </td>

                            </tr>
                    </table>