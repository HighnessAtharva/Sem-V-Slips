<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="Slip2C.aspx.cs" Inherits="Slip1C.Slip2C" %>

<script runat="server">
    private void printTable(Object sender, EventArgs e)
    {
        int number = int.Parse(n1.Value);
        result.InnerHtml = "<br><b>Table for " + number +": </b><br>    ";
        for (int i = 1; i < 10; i++)
        {
            result.InnerHtml += number + "x" + i + " = " + number * i +"<br>";
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
            <input type="number" id="n1" runat="server" placeholder="Multiplication table" />
            <br/>
            <input type="submit" runat="server" id="btn1" onserverclick="printTable" />
            <br/>
        </div>
    </form>
    <h3>Multiplication Number</h3>
    <p id="result" runat="server"></p>
</body>
</html>
