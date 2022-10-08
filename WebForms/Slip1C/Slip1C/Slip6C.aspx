<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="Slip2C.aspx.cs" Inherits="Slip1C.Slip2C" %>

<script runat="server">
    private void calcGrade(Object sender, EventArgs e)
    {
        int num = int.Parse(n1.Value);
        //string myname = Request.Form["uname"];
        if (num >= 80 && num<=100)
        {
            result.InnerHtml = "Your Grade : <b> Distinction </b>";
        }
        else if (num >= 60 && num<80)
        {
            result.InnerHtml = "Your Grade : <b> First Class </b>";
        }
        {
            result.InnerHtml = "Your Grade : <b> Second Class </b>";
        }
        else if (num >= 40 && num<50)
        {
            result.InnerHtml = "Your Grade : <b> Pass </b>";
        }
        else if (num >= 0 && num<40)
        {
            result.InnerHtml = "Your Grade : <b> FAIL </b>";
        }
            else
            {
            result.InnerHtml = "Please enter a valid percentage";
            }

    }
</script>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <h3>Enter your percentage</h3>
    <form id="form1" runat="server">
        <div>

            <input type="number" id="n1" runat="server" placeholder="Enter your percentage" />
            <br />
            <input type="submit" value="Calculate" runat="server" id="btn1" onserverclick="calcGrade" />
            <br />
        </div>
    </form>
    <h3>Your class</h3>
    <p id="result" runat="server"></p>
</body>
</html>
