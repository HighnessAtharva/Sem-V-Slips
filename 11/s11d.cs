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
            string constring = "SERVER=localhost;DATABASE=demo;UID=root;PASSWORD=''";
            MySqlConnection conn = new MySqlConnection(constring);
            conn.Open();

            string query = "select * from students2";
            MySqlCommand cmd = new MySqlCommand(query, conn);
            MySqlDataReader reader = cmd.ExecuteReader();

            Console.WriteLine("Roll No \t Student \tGrade");
            while (reader.Read())
            {
                //Using Console.Write to format it in single line instead of Console.WriteLine
                Console.Write(reader["id"] + "\t\t");
                Console.Write(reader["name"] + "\t\t");
                Console.Write(reader["percentage"] + "\t\t");
                Console.WriteLine();
            }
            
            Console.ReadLine();
        }
    }
}
