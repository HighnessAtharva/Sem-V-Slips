using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace Slip1C
{
    public partial class Slip20D : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void PrintTable(Object sender, EventArgs e)
        {
            int number = int.Parse(n1.Value);
            result.InnerHtml = "<br><b>Table for " + number + ": </b><br>    ";
            for (int i = 1; i < 10; i++)
            {
                result.InnerHtml += number + "x" + i + " = " + number * i + "<br>";
            }
        }
    }
}