// Write a method called FindMax() in C# that accepts two integers as parameters and return the maximum of the two numbers. 

using System;
using System.Linq;

namespace Demo
{
    class MyApplication
    {
        public static float max(float a, float b)
        {
            if (a > b)
            {
                return a;
            }
            else
            {
                return b;
            }
        }
        static void Main(string[] args)
        {
            int one, two;
            Console.WriteLine("Enter two numbers");
            one = Convert.ToInt32(Console.ReadLine());
            two = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Max of two numbers is " + max(one, two));

        }

    }
}