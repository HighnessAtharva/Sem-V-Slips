// C# program to illustrate the above concept
using System;

// Base Class
// public class init
// {

// }

// Derived Class
public class Accept 
{
    public String val;

     Accept(){
        Console.WriteLine("Enter a val");
        val=Console.ReadLine();
        return 0;
    }


}

// Derived Class
public class Display : Accept
{
    
     Display(String val):base(val)
    {
        Console.WriteLine("val is");
        Console.WriteLine(val);
        return 0;
    }
}

class Driver
{
    static public void Main()
    {
        Accept a= new Accept();
        

        Display d= new Display();
        
    }
}
