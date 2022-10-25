<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="Slip13D.aspx.cs" %>

<script runat="server">
    protected void AddTextBox(object sender, EventArgs e)
    {
        int index = pnlTextBoxes.Controls.OfType<TextBox>().ToList().Count + 1;
        this.CreateTextBox("txtDynamic" + index);
    }

    private void CreateTextBox(string id)
    {
        TextBox txt = new TextBox();
        txt.ID = id;
        pnlTextBoxes.Controls.Add(txt);

        Literal lt = new Literal();
        lt.Text = "<br />";
        pnlTextBoxes.Controls.Add(lt);
    }

    protected void Page_PreInit(object sender, EventArgs e)
    {
        List<string> keys = Request.Form.AllKeys.Where(key => key.Contains("txtDynamic")).ToList();
        int i = 1;
        foreach (string key in keys)
        {
            this.CreateTextBox("txtDynamic" + i);
            i++;
        }
    }

    protected void GetTextBoxValues(object sender, EventArgs e)
    {
        string message = "";
        int N = 0;
        foreach (TextBox textBox in pnlTextBoxes.Controls.OfType<TextBox>())
        {
            N++;
            message += Int32.Parse(textBox.Text);
        }
        printHere.Text = counter.ToString();


    }


</script>


<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>

 
    <form id="form1" runat="server">
<asp:Panel ID="pnlTextBoxes" runat="server">
</asp:Panel>

<asp:Button ID="btnAdd" runat="server" Text="Add New" OnClick="AddTextBox" />
<asp:Button ID="btnGet" runat="server" Text="Get Values" OnClick="GetTextBoxValues" />
 <%--   <input type="submit" runat="server" />--%>
    </form>

    <asp:Label runat="server" id="printHere"></asp:Label>  
</body>
</html>
