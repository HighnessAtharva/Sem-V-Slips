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
            string server = "localhost";
            string database = "sampledb ";
            string username = "root";
            string password = "";
            string constring = "SERVER=" + server + ";" + "DATABASE=" + database + ";" + "UID=" + username + ";" + "PASSWORD=" + password + ";";
            MySqlConnection conn = new MySqlConnection(constring);
            conn.Open();

            string query = "select * from itemlist";
            MySqlCommand cmd = new MySqlCommand(query, conn);
            MySqlDataReader reader = cmd.ExecuteReader();


            Console.WriteLine("Items are as follows");
            while (reader.Read())
            {
                Console.WriteLine("-------");
                Console.WriteLine(reader["itemid"]);
                Console.WriteLine(reader["itemname"]);
                Console.WriteLine(reader["itemprice"]);
                Console.WriteLine("-------");
            }

            Console.ReadLine();
        }
    }
}
