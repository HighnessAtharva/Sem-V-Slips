import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class s5b extends HttpServlet {
public void doGet(HttpServletRequest request, HttpServletResponse throws IOException, ServletException
{
response.setContentType("text/html");
PrintWriter out= res.getWriter();
Connection con=null;
Statement st=null;
ResultSet rs=null,rs1=null;
out.println("");
out.println("");
try{
    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
    Connection cn=DriverManager.getConnection("jdbc:odbc:dsn");
    if(con==null)
        msg="Connection to databse failed";
    else
    {
        st=con.createStatement();
        rs=st.executeQuery("select * from product");
        if(rs==null || rs1==null){
            rs.next();
            rs1.next();
            int i=1;
            out.println("prod code:"+rs.getInt(1)+" \t\t\tpname:"+rs.getString(3)+"\n"+"price"+rs.getString(2)+"\n");
            int netB=0,sumT=0;
                while(rs1.next()){
                sumT=rs1.getInt(2)*rs1.getInt(3);
                out.println(i +"\t\t\t"+rs1.getString(1)+"\t\t"+ rs1.getInt(2)+"\t\t"+ rs1.getInt(3)+"\t\t"+sumT+"\n");
                }
            }
    }
}

catch(Exception e) { 
    out.println(e);
}
out.println("");
out.println("");
}
