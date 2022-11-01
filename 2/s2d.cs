//Write a C# program to accept n names of cities from the user and display them in descending order.

using System;
using System.Linq;

namespace System{
    class Program{
        static void Main(string[] args){
            string[] cities = new string[50] ;
            Console.WriteLine("Enter the number of cities");
            int n =Int32.Parse( Console.ReadLine());
            for(int i = 0; i < n; i++){
                Console.WriteLine("Enter city name");
                cities[i] = Console.ReadLine();
            }
            Array.Sort(cities);
            Array.Reverse(cities);
            Console.WriteLine("Sorted cities in descending order are:");
            foreach(string city in cities){
                Console.WriteLine(city);
            }
        }
    }
}