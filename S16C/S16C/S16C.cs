/*Write C# program to connect with MySQL database called sampledb in WAMP server. 
Display the data from the table itemlist that has itemid, itemname and itemprice as its fields.  */

using MySql.Data.MySqlClient;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CSharpMYSQL
{
    class s16C
    {
        static void Main(string[] args)
        {
       
            MySqlConnection conn = new MySqlConnection("SERVER=localhost; DATABASE=sampledb;UID=root;PASSWORD=''");
            conn.Open();

            string query = "select * from itemlist";
            MySqlCommand cmd = new MySqlCommand(query, conn);
            MySqlDataReader reader = cmd.ExecuteReader();

            Console.WriteLine("Items are as follows");
            while (reader.Read())
            {
                Console.WriteLine("{0} | {1} | {2}", reader["itemid"], reader["itemname"], reader["itemprice"]);
            }
            Console.ReadLine();
        }
    }
}
