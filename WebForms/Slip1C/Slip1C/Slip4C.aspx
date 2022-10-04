<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="Slip2C.aspx.cs" Inherits="Slip1C.Slip2C" %>

<script runat="server">
    private void printTable(Object sender, EventArgs e)
    {
        int number = int.Parse(n1.Value);
        result.InnerHtml = "Table:<br> ";
        for (int i=1; i<=10; i++)
        {
            result.InnerHtml += number * i;
            result.InnerHtml += "<br>";
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
            <input type="text" id="n1" runat="server" placeholder="Enter number to print table" />
            <br/>
            <input type="submit" runat="server" id="btn1" onserverclick="printTable" />
            <br/>
        </div>
    </form>
    <h3>Table for your entered number is </h3>
    <p id="result" runat="server"></p>
</body>
</html>
