/* Write a C# program to create a class that accepts an array as an argument and finds the average of the elements in that array. 
Display this average.     */

using System;

class Test
{
    static void Main(String[] args)
    {
        int average;
        int sum = 0;

        int[] terms = new int[args.Length];
        for (int i = 0; i < args.Length; i++)
        {
            terms[i] = Int32.Parse(args[i]);
        }

        for (int i = 0; i < terms.Length; i++)
        {
            sum += terms[i];
        }
        for (int i = 0; i < terms.Length; i++)
        {
            Console.WriteLine(terms[i]);
        }

        average = sum / terms.Length;
        Console.WriteLine("Average of the elements in the array is {0}", average);

    }
}

