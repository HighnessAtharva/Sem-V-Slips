<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="Slip1C.aspx.cs" Inherits="Slip1C.Slip1C" %>

<script runat="server">
    private void checkforprime(Object sender,EventArgs e)
    {
        int n = int.Parse(n1.Value);
        Boolean a=false;
        for(int i=2;i<n;i++)
        {

            if(n % i == 0)
            {
                a = true;
                break;
            }
            //else if(n%i!=0)
            //{
            // result.InnerHtml = "yay!! prime number";
            //}
        }
        if (a)
        {
            result.InnerHtml = "not a prime";

        }else
            {
                result.InnerHtml = "yay!! prime number";
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
            <input type="text" id="n1" runat="server" placeholder="Check for prime number" /> <br/>
            <input type="submit" runat="server" id="btn1" onserverclick="checkforprime" /> <br/>
        </div>
    </form>
    <h3>Test for Prime Number:</h3>
    <p id="result" runat="server"></p>
</body>
</html>
