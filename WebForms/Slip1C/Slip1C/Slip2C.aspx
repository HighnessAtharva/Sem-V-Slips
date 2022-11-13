<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="Slip2C.aspx.cs" Inherits="Slip1C.Slip2C" %>

<script runat="server">
    private void checkforperfect(Object sender, EventArgs e)
    {
        int n, sum = 0;
        int number = int.Parse(n1.Value);
        n = number;
        for (int i = 1; i < number; i++)
        {
            if (number % i == 0)
            {
                sum = sum + i;
            }
        }
        if (sum == n){
            result.InnerHtml = "Entered number is a perfect number";
        }
        else{
            result.InnerHtml = "Entered number is not a perfect number";
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
            <input type="text" id="n1" runat="server" placeholder="Check for perfect number" /> <br>
            <input type="submit" runat="server" id="btn1" onserverclick="checkforperfect" /> <br>
    </form>
    <h3>Perfect Number Test</h3>
    <p id="result" runat="server"></p>
</body>
</html>
