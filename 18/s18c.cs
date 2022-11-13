/*Write C# program to identify the type of the input from the user.*/

using System;
public class PrimeNumberExample
{
    public static void Main(string[] args)
    {
        Console.WriteLine("Enter something");
        string o = Console.ReadLine();

        string finalType = "Special Character";
        if (!string.IsNullOrEmpty(o))
        {
            // Check integer before Decimal
            int tryInt;
            decimal tryDec;
            if (Int32.TryParse(o, out tryInt))
            {
                finalType = "Integer";
            }
            else if (Decimal.TryParse(o, out tryDec))
            {
                finalType = "Decimal";
            }
            else if (o.Length == 1)
            {
                finalType = "Char";
            }
            else if (o.Length > 1)
            {
                finalType = "String";
            }

        }
        else
        {
            finalType = "Empty";
        }

        Console.WriteLine(finalType);
        Console.ReadLine();


    }
}