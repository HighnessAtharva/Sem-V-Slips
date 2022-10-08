using System;

class Test{
    static void Main(string[] args){
        String s1, s2;
        
        Console.WriteLine("Enter String 1");
        s1=Console.ReadLine();

        Console.WriteLine("Enter String 2");
        s2=Console.ReadLine();
    
        
        if((s1.Length==s2.Length) && (s1.Equals(s2)))
            Console.WriteLine("Strings are of same length and equal");
        else
            Console.WriteLine("Strings are not equal");

        Console.ReadLine();
    }
}