using System;  
  public class PrimeNumberExample  
   {  
     public static void Main(string[] args)  
      {  
          Console.WriteLine("Enter something: ");

          //take a value and output its data type
            string input = Console.ReadLine();
            Console.WriteLine("You entered: " + input);
            try{
                int val1 = int.Parse(input);
                Console.WriteLine("You entered ");
                Console.WriteLine( val1.GetType());
            }catch(Exception e){
                Console.WriteLine("You entered a string");
            }




     }  
   }  