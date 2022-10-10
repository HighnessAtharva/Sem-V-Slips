<%--Write ASP program to accept mobile number and name from the user and validate it. --%>

<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="Slip2C.aspx.cs" Inherits="Slip1C.Slip2C" %>

<script runat="server">
    private void validator(Object sender, EventArgs e)
    {
        string uname = Request.Form["my1"];

        double numericValue;
        try {
           numericValue=double.Parse(my2.Value);
                if ((numericValue.ToString().Length==10) && (numericValue>0)){
                result.InnerHtml = "Mobile number is valid ";
                }
                else
                {
                  result.InnerHtml = "Enter a valid length of Mobile Number ";
                }
        }catch(Exception ex)
            {
              result.InnerHtml = "Must be a number, not a string " + uname + ". Error: " + ex.Message;
            }



    }
</script>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>

    <form id="form1" runat="server">
        <div>
            <h3>Enter name</h3>
            <input type="text" id="my1" runat="server" placeholder="Your name..." />
            <br />

             <input type="text" id="my2" runat="server" placeholder="Your contact..." />
            <br />


            <input type="submit" value="Convert" runat="server" id="btn1" onserverclick="validator" />
            <br />
        </div>
    </form>
    <h3>Result:</h3>
    <p id="result" runat="server"></p>
</body>
</html>
