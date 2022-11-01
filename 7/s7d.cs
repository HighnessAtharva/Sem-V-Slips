/*Write a C# demo program for hierarchical inheritance.  Program must contain accept(), display() methods.*/

using System;
namespace Studytonight
{
    public class Parent
    {
        public void DisplayParentsAB()
        {
            Console.WriteLine("A and B are my parents");
        }
    }

    public class ChildC : Parent
    {
        string name;
        public void accept(string childName)
        {
            this.name = childName;
        }
        public void Display()
        {
            Console.WriteLine("I am the child C. My name is {0}", this.name);
        }
    }

    public class ChildD : Parent
    {
        string name;
        public void accept(string childName)
        {
            this.name = childName;
        }
        public void Display()
        {
            Console.WriteLine("I am the child D. My name is {0}", this.name);
        }
    }

    public class Program
    {
        public static void Main(string[] args)
        {
            ChildC c = new ChildC();
            ChildD d = new ChildD();

            c.accept("Atharva");
            c.Display();
            c.DisplayParentsAB();  // accessing parent class

            Console.WriteLine();

            d.accept("Aegon");
            d.Display();
            d.DisplayParentsAB();   // accessing parent class
        }
    }
}