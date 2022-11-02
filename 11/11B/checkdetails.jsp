<html>

<head>
    <title>Check Credentials</title>
</head>

<body>
    <%
        String uid=request.getParameter("id");
        String password=request.getParameter("pass");
        session.setAttribute("session-uid", uid);
        if(uid.equals("Atharva") && password.equals("Atharva"))
        {
        response.sendRedirect("success.jsp");
        }
        else        
        {
               response.sendRedirect("failed.jsp");
        }
        %>
</body>

</html>