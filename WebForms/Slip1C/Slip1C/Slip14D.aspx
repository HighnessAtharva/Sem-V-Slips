<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="Slip14D.aspx.cs" %>

<script runat="server">
    protected void ImageButton1_Click(object sender, ImageClickEventArgs e)
    {
        Calendar1.Visible = !Calendar1.Visible;
    }
    protected void Calendar1_SelectionChanged(object sender, EventArgs e)
    {
        TextBox1.Text = Calendar1.SelectedDate.ToShortDateString();
        String birthdate= Calendar1.SelectedDate.Day.ToString();
        if (birthdate == "5") {
            result.InnerText = "Happy Birthday";
        }
        else
        {
            result.InnerText = "Not your birthday today";
        }
        Calendar1.Visible = false;
    }

</script>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
   
    
   <form runat="server">
  
       <asp:TextBox ID="TextBox1" runat="server" Width="115px" ></asp:TextBox>
<asp:ImageButton ID="ImageButton1" runat="server" 
    ImageUrl="~/Images/Calendar.png" onclick="ImageButton1_Click" />
<asp:Calendar ID="Calendar1" runat="server" onselectionchanged="Calendar1_SelectionChanged" Visible="false"></asp:Calendar>
       </form>
          <h3 id="result" runat="server"></h3>

</body>
</html>
