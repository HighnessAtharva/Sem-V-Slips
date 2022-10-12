import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.http.Cookie;

public class s12b extends HttpServlet
{
static int i=1;
public void doGet(HttpServletRequest request,HttpServletResponse response)
    throws IOException,ServletException
{
response.setContentType("text/html");
PrintWriter out=response.getWriter();
String k=String.valueOf(i);
Cookie c=new Cookie("visit",k);
response.addCookie(c);
int j=Integer.parseInt(c.getValue());
if(j==1)
{
    out.println("Welcome to web page ");
}
else        {
    out.println("You are visited at "+i+" times");
}
i++;
}
}