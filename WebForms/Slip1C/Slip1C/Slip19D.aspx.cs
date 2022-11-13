using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace Slip1C
{
    public partial class Slip19D : System.Web.UI.Page
    {

        protected void Button1_Click(object sender, EventArgs e)
        {
            String gender="";
            message.Text = "";

            if (RadioButton1.Checked){
                gender = "boi";
            }

            if (RadioButton2.Checked){
                gender = "gurl";
            }
            message.Text = "I am <b>" + Request["myname"] + "</b>, my age is <b>" + Request["myage"] + "</b> and I am a <b>" + gender + "</b>";
            
            //message.Text = "I am " + Request["myname"] + ", my age is: " +Request["myage"] + "and I am a " + gender;
        }
    }
}