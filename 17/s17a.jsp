<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
String name = request.getParameter("name");
int age = Integer.parseInt(request.getParameter("age"));
if(age >=18)
{
out.println(name + "\nAllowed to vote");
}
else
{
out.println(name + "\nNot allowed to vote");
}
%>