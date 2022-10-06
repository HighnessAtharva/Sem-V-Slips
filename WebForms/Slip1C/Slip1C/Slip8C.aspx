<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="Slip8C.aspx.cs" Inherits="Slip1C.Slip8C" %>

<script runat="server">
    private void INRToUSD(Object sender, EventArgs e)
    {
        double INR = int.Parse(n1.Value);
        double USD = INR /70;
        result.InnerHtml = INR + "INR equates to " + USD + "USD";
    }

    private void USDToINR(Object sender, EventArgs e)
    {
        double USD = int.Parse(n2.Value);
        double INR = USD * 70;
        result2.InnerHtml = USD + "USD equates to " + INR + "INR";
    }

</script>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>



    <form id="form1" runat="server">

        <%--INR TO USD--%>
        <h3>INR TO USD Converter</h3>
        <div>

            <input type="number" id="n1" runat="server" placeholder="INR" />
            <br />
            <input type="submit" value="Convert" runat="server" id="btn1" onserverclick="INRToUSD" />
            <br />
        </div>
        <h3>Converting to USD</h3>
        <p id="result" runat="server"></p>

        <br /><hr />

        <%--USD TO INR--%>
        <h3>USD TO INR Converter</h3>

        <div>

            <input type="number" id="n2" runat="server" placeholder="USD" />
            <br />
            <input type="submit" value="Convert" runat="server" id="Submit2" onserverclick="USDToINR" />
            <br />
        </div>

        <h3>Converting to INR</h3>
        <p id="result2" runat="server"></p>


    </form>
</body>
</html>
