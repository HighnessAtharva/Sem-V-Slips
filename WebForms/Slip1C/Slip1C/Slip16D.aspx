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

        <br />
        <h2>ASP Control</h2>
        <h2>The date and time is <% =DateTime.Now.ToString(  ) %>.</h2>
           <br />
        <div>  
            <asp:HyperLink ID="HyperLink1" runat="server" Text="Google" NavigateUrl="www.google.com"></asp:HyperLink>  
        </div>  
        <br />
        <br />

        
        Book Name:&nbsp;&nbsp;&nbsp;
      
     
        
        <asp:TextBox
          ID="txtBookName"
          size="40"
          Text="Enter book name."
          runat="server" />

        <br />
    
            
        <br />
        Comments: <asp:TextBox ID="commentBox" runat="server" placeholder="comments"></asp:TextBox>

        <br /> <br />
        <asp:Button
            ID="btnBookName"
            Text="Book Name"
            OnClick="btnBookName_Click"
            runat="server" />
        
         <p>Browse to Upload File</p>  
            <asp:FileUpload ID="FileUpload1" runat="server" />  


        <br /><br />
            <asp:Label ID="lblBookName" Text="" runat="server" /><br />
            <asp:Label ID="lblBookComment" Text="" runat="server" />

     

    </form>
</body>
</html>
