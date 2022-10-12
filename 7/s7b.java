import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
public class s7b extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        res.setCountentType("html/text");
        PrintWriter pw = res.getWriter();
        try {
            int roll = Integer.parseInt(req.getParameter("txtsno"));
            String name= req.getParameter("txtnm");
            String myclass= req.getParameter("txtclass");
            int sub1= Integer.parseInt(req.getParameter("txtsub1"));
            int sub2= Integer.parseInt(req.getParameter("txtsub2"));
            int sub3= Integer.parseInt(req.getParameter("txtsub3"));

            int total= sub1+sub2+sub3;
            int percent= total*100/300;
            pw.println("Hi" + name + " your roll no is " + roll + " and your class is " + myclass + " and your marks are " + total + " and your percentage is " + percent);
            
        } catch (Exception e) {
            pw.println(e);
        }

    }
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        doPost(req, res);
    }
}