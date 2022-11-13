<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="Slip18D.aspx.cs" %>

<script runat="server">
    void randomize(object sender, EventArgs e)
    {
       string[] names = new string[] { "This is a really really really really really really really really long string damnnnn woooooooooooooooooooooooooooooooooooooooooooooooooooooooo", ":)", "hello there" };

        int index = new Random().Next(names.Length);
        text1.InnerHtml = names[index];

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
            <asp:Panel ID="Panel1" runat="server" BorderColor="#990000" BorderStyle="Solid" Height="116px" ScrollBars="Both" 
                style="width:150px">
   
   <textbox id="text1" name="text" runat="server"> This is a scrollable panel.</textbox>
   <br />
   <br />

   <input type="submit" runat="server" onserverclick="randomize" value="Button" style="width:82px" />
</asp:Panel>

        </div>
    </form>
</body>
</html>
