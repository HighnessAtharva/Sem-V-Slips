/*Write a JSP program to check whether given number is Armstrong or not. (Use Include directive). */

<%@ page contentType="text/html" pageEncoding="UTF-8"%>

    <!DOCTYPE html>

    <%@ include file="header.html" %>


        <%
    int num = Integer.parseInt(request.getParameter("num"));
    int n = num;
    int rem, sum = 0;
    while(n!=0)
    {
        rem = n%10;
        sum = sum+rem*rem*rem;
        n = n/10;
    }
    if(sum == num)
    {
        out.println("\nArmstrong Number");
    }
    else
    {
        out.println("Not Armstrong");
    }
%>