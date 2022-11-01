/*Write C# program to connect with MySQL database booksdb from WAMP server and search for a book titled ‘ASP dot NET’ 
from the table books that has bookname as the field to compare the book name to.*/

using MySql.Data.MySqlClient;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CSharpMYSQL
{
    class s20C
    {
        static void Main(string[] args)
        {
            string server = "localhost";
            string database = "booksdb";
            string username = "root";
            string password = "";
            string constring = "SERVER=" + server + ";" + "DATABASE=" + database + ";" + "UID=" + username + ";" + "PASSWORD=" + password + ";";
            MySqlConnection conn = new MySqlConnection(constring);
            conn.Open();

            string query = "select * from books where bookname ='ASP dot NET'";
            MySqlCommand cmd = new MySqlCommand(query, conn);
            MySqlDataReader reader = cmd.ExecuteReader();


            while (reader.Read())
            {
                Console.WriteLine("Searched book exists");
                Console.WriteLine(reader["bookname"]);
            }

            Console.ReadLine();
        }
    }
}
