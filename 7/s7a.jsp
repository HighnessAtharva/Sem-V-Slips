/*Write a JSP page, which accepts user name in a text box and greets the user according to the time on server machine. */

<html>
    <body>
        <%
            String name=request.getParameter("username");
            java.util.Date d=new java.util.Date();
            int hr=d.getHours();
            if(hr<12)
            {
                out.println("Good Morning:"+name);
            }   
            if(hr>12 && hr<16)
            {
                out.println("Good Afternoon:"+name);
            }
            if(hr>16)
            {
                out.println("Good Evening:"+name);
            }
        %>
    </body>
</html>