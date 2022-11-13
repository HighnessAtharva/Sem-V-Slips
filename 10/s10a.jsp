<html>

<body>
    <%@ page import="java.util.regex.*" %>
        <%
        String email=request.getParameter("t1");

        String regex = "(.+)@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        boolean result= pattern.matcher(email).matches();

        if(result)
            out.println("Given Email Id is Valid");
        else        
            out.println("Given Email id is not Valid");
        
        %>
</body>

</html>