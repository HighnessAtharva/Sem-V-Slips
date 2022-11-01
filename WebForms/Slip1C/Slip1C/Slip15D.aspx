<%--Write ASP program to create a web form to accept username and password and compare the username with “admin” and password with “abcd1234”. 
If the input is correct display the message “valid user” otherwise “invalid user”.              
--%>


<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="Slip2C.aspx.cs" Inherits="Slip1C.Slip2C" %>

<script runat="server">
    private void checkLogin(Object sender, EventArgs e)
    {

        string myname = Request["uname"];
        string mypass = Request["upass"];
        if((myname=="admin") && (mypass == "abcd1234"))
        {
            result.InnerHtml = "Login Success";
        }
        else
        {
            result.InnerHtml = "Wrong Credentials.";
        }

    }
</script>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <h3>Login</h3>
    <form id="form1" runat="server">
        <div>

            <input type="text" id="uname" runat="server" placeholder="Username -> admin" />
            <br />

                 <input type="text" id="upass" runat="server" placeholder="Password -> abcd1234" />
            <br />

            <input type="submit" value="Login" runat="server" id="btn1" onserverclick="checkLogin" />
            <br />
        </div>
    </form>
    <h3>Validation Message</h3>
    <p id="result" runat="server"></p>
</body>
</html>
