<%@ page errorPage="error.jsp" %>
<html>
    <body>
        <H1><center>Result for <%=request.getParameter("a1")%></center></H1>
        <%
            String num1=request.getParameter("t1");  
            String num2=request.getParameter("t2");  
  
            int i=Integer.parseInt(num1);  
            int j=Integer.parseInt(num2);  

            int k=0;
            String str=request.getParameter("a1");
            if(str.equals("add"))
                k=i+j;
            if(str.equals("sub"))
                k=i-j;
            if(str.equals("mul"))
                k=i*j;
            if(str.equals("div"))
                k=i/j;
        %>
        Result is: <%=k%>
    </body>
</html>