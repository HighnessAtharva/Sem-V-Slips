<%@page contentType="text/html" pageEncoding="UTF-8" %>
    <!DOCTYPE html>
    <html>

    <body>
        <%@ page import="java.sql.*;" %>
            <%! inthno; String hname,address; %>
                <% static final String DB_URL="jdbc:mysql://localhost/demo" ; static final String USER="root" ; static
                    final String PASS="" ; try (Connection conn=DriverManager.getConnection(DB_URL, USER, PASS);
                    Statement st=conn.createStatement();) { ResultSet rs=st.executeQuery("select * from Hospital"); %>
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

    </html>