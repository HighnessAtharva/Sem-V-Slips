<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="Slip2C.aspx.cs" Inherits="Slip1C.Slip2C" %>

<script runat="server">
    private void convertToFaren(Object sender, EventArgs e)
    {
        double cel = int.Parse(n1.Value);
        double fahrenheit;
        fahrenheit = (cel * 9) / 5 + 32;
        result.InnerHtml = "Your value in Celcius: " + cel;
        result.InnerHtml += "<br>";
        result.InnerHtml += "Converted to Fahrenheit: " + fahrenheit;
       
    }
</script>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <h3>Enter tempreture in Celcius</h3>
    <form id="form1" runat="server">
        <div>

            <input type="number" id="n1" runat="server" placeholder="Celcius" />
            <br />
            <input type="submit" value="Convert" runat="server" id="btn1" onserverclick="convertToFaren" />
            <br />
        </div>
    </form>
    <h3>Converting in Fahrenheit</h3>
    <p id="result" runat="server"></p>
</body>
</html>
