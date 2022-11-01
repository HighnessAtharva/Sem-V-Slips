/* Write C# program to display the following data stored in the app.
	Roll No          Student         Grade
*/

using System;

namespace s11d
{
    public class Program
    {
        public static void Main(string[] args)
        {
           object[][] pupils = new object[][]{
           new object[] {141,"Rakesh", 89},
           new object[] {142,"Mukta", 90},
           new object[] {143,"Jonathan", 88},
           new object[] {144, "Sayali", 85},
           new object[] {145, "Shyam", 77}
        };

            Console.WriteLine("PupilID\tName\tMarks");
            foreach (object[] pupil in pupils)
            {
                Console.WriteLine("{0}\t{1}\t{2}", pupil[0], pupil[1], pupil[2]);
            }


        }
    }
}
