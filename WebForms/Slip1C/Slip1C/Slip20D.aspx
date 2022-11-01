<%@ Page Language="C#" AutoEventWireup="true" CodeFile="Slip20D.aspx.cs" Inherits="Slip1C.Slip20D" %>


<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
        <div>
            <input type="number" id="n1" runat="server" placeholder="Multiplication table" />
            <br/>
            <input type="submit" runat="server" id="btn1" onserverclick="PrintTable" />
            <br/>
        </div>
    </form>
    <h3>Multiplication Number</h3>
    <p id="result" runat="server"></p>
</body>
</html>
