/* Write a JSP script to check whether given mail ID is valid or not. (Mail ID should contain one @ symbol).*/

<html>

<body>
    <%@ page language="java" %>
        <%
        String email=request.getParameter("t1");
        if(email.contains("@") && email.contains("."))
        {
        out.println("Given Email Id is Valid");
        }
        else        {
        out.println("Given Email id is not Valid");
        }
        %>
</body>

</html>