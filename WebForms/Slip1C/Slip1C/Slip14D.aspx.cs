using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace Slip1C
{
    public partial class Slip14D : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {
            if (!IsPostBack)
            {
                Calendar1.Visible = false;
            }
        }

        protected void ImageButton1_Click(object sender, ImageClickEventArgs e)
        {
            Calendar1.Visible = !Calendar1.Visible;
        }
        protected void Calendar1_SelectionChanged(object sender, EventArgs e)
        {
            TextBox1.Text = Calendar1.SelectedDate.ToShortDateString();
            String birthdate = Calendar1.SelectedDate.Day.ToString();
            if (birthdate == "5")
            {
                result.InnerText = "Happy Birthday";
            }
            else
            {
                result.InnerText = "Not your birthday today";
            }
            Calendar1.Visible = false;
        }

    }
}