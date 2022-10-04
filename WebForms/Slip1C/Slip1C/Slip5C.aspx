<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="Slip2C.aspx.cs" Inherits="Slip1C.Slip2C" %>

<script runat="server">
    private void checkEligibility(Object sender, EventArgs e)
    {
        int number = int.Parse(n1.Value);
        string myname = Request.Form["uname"];
        if(number>=18 && number <= 27)
        {
            result.InnerHtml = myname + "is elgible to vote";
        }
        else
        {
            result.InnerHtml = myname + "is not eligible to vote.";
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
            <input type="text" id="uname" runat="server" placeholder="Enter name" />
            <br/>
            <input type="text" id="n1" runat="server" placeholder="Enter age" />
            <br/>
            <input type="submit" value="vote" runat="server" id="btn1" onserverclick="checkEligibility" />
            <br/>
        </div>
    </form>
    <h3>Elgible to Vote? </h3>
    <p id="result" runat="server"></p>
</body>
</html>
