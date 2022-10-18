//Slip7b file-2 (file-1:marks.html)

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Slip7b extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException
	{
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		try
		{
			String s=request.getParameter("marks");
			int m=Integer.parseInt(s);
			double d=m/5;
			out.println("<html><body><h1>");
			out.println(d);
			if(d>=70)
				out.println("Distinction");
			else if(d>=60 && d<70)
				out.println("First Class");
			else if(d>=50 && d<60)
				out.println("Second Class");
			else
				out.println("Fail");
			out.println("</h1></body></html>");
		}
		catch(Exception e)
		{
			out.println(e);
		}
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException
	{
		doGet(request,response);
	}
}
		
			
			