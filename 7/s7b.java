import java.io.*; 
import javax.servlet.*; 
import javax.servlet.http.*; 
public class s7b extends HttpServlet { public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException { int sno,s1,s2,s3,total; String snm,sclass;
float per; res.setContentType("text/html"); PrintWriter out=res.getWriter(); sno=Integer.parseInt(req.getParameter("txtsno")); snm=req.getParameter("txtnm"); sclass=req.getParameter("txtclass"); s1=Integer.parseInt(req.getParameter("txtsub1")); s2=Integer.parseInt(req.getParameter("txtsub2"));
s3=Integer.parseInt(req.getParameter("txtsub3")); total=s1+s2+s3; per=(total/3); out.println("
<html>

<body>"); out.print("
    <h2>Result of student</h2><br>"); out.println("
    <b><i>Roll No :</b></i>"+sno+"<br>"); out.println("
    <b><i>Name :</b></i>"+snm+"<br>"); out.println("
    <b><i>Class :</b></i>"+sclass+"<br>"); out.println("
    <b><i>Subject1:</b></i>"+s1+"<br>"); out.println("
    <b><i>Subject2:</b></i>"+s2+"<br>"); out.println("
    <b><i>Subject3:</b></i>"+s3+"<br>"); out.println("
    <b><i>Total :</b></i>"+total+"<br>"); out.println("
    <b><i>Percentage :</b></i>"+per+"<br>"); if(per
    <50) out.println( "<h1><i>Pass Class</i></h1>"); else if(per<55 && per>50) out.println("
        <h1><i>Second class</i></h1>"); else if(per
        <60 && per>=55) out.println("
            <h1><i>Higher class</i></h1>"); out.close(); } }