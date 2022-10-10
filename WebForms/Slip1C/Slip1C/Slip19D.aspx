<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="Slip19D.aspx.cs"   %>  
<!DOCTYPE html>  

<script runat="server">
    protected void Button1_Click(object sender, EventArgs e)
    {

        string gender;

        message.Text = "";
        if (RadioButton1.Checked)
        {
            gender = "boi";
             message.Text = "I am <b>" + Request["myname"] + "</b>, my age is <b>" +Request["myage"] + "</b> and I am a <b>" + gender +"</b>";
        }
        if (RadioButton2.Checked)
        {
            gender = "gurl";
            message.Text = "I am <b>" + Request["myname"] + "</b>, my age is <b>" +Request["myage"] + "</b> and I am a <b>" + gender+"</b>";
        }

        //message.Text = "I am " + Request["myname"] + ", my age is: " +Request["myage"] + "and I am a " + gender;

    }
    </script>

<html xmlns="http://www.w3.org/1999/xhtml">  
<head runat="server">  
    <title></title>  
</head>  
<body>  
    <form id="form1" runat="server">  
        Enter Name:<asp:TextBox ID="myname" runat="server" Text="Atharva"></asp:TextBox>
        Enter Age:<asp:TextBox ID="myage" runat="server" Text="19"></asp:TextBox>
        
        <div>  
            <asp:RadioButton ID="RadioButton1" runat="server" Text="Male" GroupName="gender" />  
            <asp:RadioButton ID="RadioButton2" runat="server" Text="Female" GroupName="gender" />  
        </div>  
        <p>  
            <asp:Button ID="Button1" runat="server" Text="Submit" OnClick="Button1_Click" style="width: 61px" />  
        </p>  
    </form>  
    <asp:Label runat="server" id="message"></asp:Label>  
</body>  
</html>  