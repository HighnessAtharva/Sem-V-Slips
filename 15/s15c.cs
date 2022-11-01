// Write C# program to search for a string entered by the user in an already stored sentence. 
// If the string is found in the sentence display the message “Found” otherwise display “Not Found”. 

using System;

class Test
{
    // Main Method
    public static void Main()
    {
        // string type
        String str = "Berserk and Neon Genesis Evangelion are top-tier shows.";
        String userStr;
        Console.WriteLine("Enter a string to search for in a sentence: ");
        userStr = Console.ReadLine();

        if (str.Contains(userStr))
        {
            Console.WriteLine("Found");
        }
        else
        {
            Console.WriteLine("Not Found");
        }
    }
}