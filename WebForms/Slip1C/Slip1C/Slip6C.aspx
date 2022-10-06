<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="Slip2C.aspx.cs" Inherits="Slip1C.Slip2C" %>

<script runat="server">
    private void calcGrade(Object sender, EventArgs e)
    {
        int num = int.Parse(n1.Value);
        //string myname = Request.Form["uname"];
        if (num >= 90)
        {
            result.InnerHtml = "You get Grade A";
        }
        else if (num >= 80)
        {
            result.InnerHtml = "You get Grade B";
        }
        else if (num >= 70)
        {
            result.InnerHtml = "You get Grade C";
        }
        else if (num >= 50)
        {
            result.InnerHtml = "You get Grade D";
        }
        else
        {
            result.InnerHtml = "FAIL";
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

            <input type="text" id="n1" runat="server" placeholder="Enter your percentage" />
            <br />
            <input type="submit" value="Calculate" runat="server" id="btn1" onserverclick="calcGrade" />
            <br />
        </div>
    </form>
    <h3>Your class</h3>
    <p id="result" runat="server"></p>
</body>
</html>
