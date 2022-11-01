<%@ Page Language="C#" AutoEventWireup="true" CodeFile="Slip19D.aspx.cs" Inherits="Slip1C.Slip19D"%>  
<!DOCTYPE html>  


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