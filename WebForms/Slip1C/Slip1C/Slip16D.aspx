<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="Slip2C.aspx.cs" Inherits="Slip1C.Slip2C"%>

<html>

<script runat="server">
    void btnBookName_Click(Object Source, EventArgs E)
    {
        lblBookName.Text = "<b>Book Name: </b>" + txtBookName.Text;
        lblBookComment.Text= "<b>Comments: </b>"+ commentBox.Text;
    }

</script>

<body>
    <form runat="server">
        <h2>ASP Control</h2>
        <h2>The date and time is <% =DateTime.Now.ToString(  ) %>.</h2> <br />
        <asp:HyperLink ID="HyperLink1" runat="server" Text="Google" NavigateUrl="www.google.com"></asp:HyperLink><br/><br/>

        Book Name:&nbsp;&nbsp;&nbsp;   
        
        <asp:TextBox ID="txtBookName" size="40" Text="Enter book name." runat="server" /><br />
        
        Comments: <asp:TextBox ID="commentBox" runat="server" placeholder="comments"></asp:TextBox><br/><br/>

        <asp:Button ID="btnBookName" Text="Print Submitted Details " OnClick="btnBookName_Click" runat="server" /><br />
        
     
        <asp:Label ID="lblBookName" Text="" runat="server" /><br />
        <asp:Label ID="lblBookComment" Text="" runat="server" /> <br /><hr />

           <p>Browse to Upload File</p>  
        <asp:FileUpload ID="FileUpload1" runat="server" /> <br /><br />

    </form>
</body>
</html>
