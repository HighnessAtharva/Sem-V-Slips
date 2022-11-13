<%@ page errorPage="error.jsp" %>
    <html>

    <body>
        <H1>
            <center>Result for
                <%=request.getParameter("a1")%>
            </center>
        </H1>
        <%
         
            int i=Integer.parseInt(request.getParameter("t1"));  
            int j=Integer.parseInt(request.getParameter("t2"));  
            String str=request.getParameter("a1"); 

            int k=0;
            
            if(str.equals("Addition"))
                k=i+j;
            if(str.equals("Subtraction"))
                k=i-j;
            if(str.equals("Multiplication"))
                k=i*j;
            if(str.equals("Division"))
                k=i/j;
        %>
            Result is:
            <%=k%>
    </body>

    </html>