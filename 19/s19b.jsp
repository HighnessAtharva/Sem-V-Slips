<html>

<body>
    <%@ page import = "java.io.*,java.util.*,java.sql.*"%>
        <%! 
static final String DB_URL = "jdbc:mysql://localhost/demo";
static final String USER = "root";
static final String PASS = "";
int ano,bal;
       String type;  %>
            <%
      ano=Integer.parseInt(request.getParameter("ano"));
      type=request.getParameter("type");
      bal=Integer.parseInt(request.getParameter("bal"));
      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();
      ) {	
            PreparedStatement s=conn.prepareStatement("insert into account values(?,?,?)");
            s.setInt(1,ano);
            s.setString(2,type);
            s.setInt(3,bal);
            s.executeUpdate();
            out.println("Record is saved");
            
            ResultSet rs=stmt.executeQuery("select * from account");
%>
                <table border="1" width="40%">
                    <%      while(rs.next())
            {
%>
                        <tr>
                            <td>
                                <%= rs.getInt("ano") %>
                            </td>
                            <td>
                                <%= rs.getString("type") %>
                            </td>
                            <td>
                                <%= rs.getInt("bal") %>
                            </td>
                        </tr>
                        <%
            }
            conn.close();
          }catch(Exception e)
            {      
                   out.println(e);      
            }
%>
</body>

</html>