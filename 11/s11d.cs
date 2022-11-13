/* Write C# program to display the following data stored in the app.
	Roll No          Student         Grade
*/

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using MySql.Data.MySqlClient;

namespace S11D
{
    class Program
    {
        static void Main(string[] args)
        {
            MySqlConnection conn = new MySqlConnection("SERVER=localhost;DATABASE=demo;UID=root;PASSWORD=''");
            conn.Open();

            string query = "select * from students2";
            MySqlCommand cmd = new MySqlCommand(query, conn);
            MySqlDataReader reader = cmd.ExecuteReader();

            Console.WriteLine("Roll No \t Student \tGrade");
            while (reader.Read())
            {
                Console.WriteLine("{0}     {1}       {2} ",reader["id"], reader["name"], reader["percentage"]);   
            }
            Console.ReadLine();
        }
    }
}
