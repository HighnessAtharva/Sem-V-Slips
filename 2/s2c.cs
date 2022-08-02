/*Perfect number is a positive number which sum of all positive divisors excluding that number is equal to that number. For example 6 is perfect number since divisor of 6 are 1, 2 and 3.  Sum of its divisor is 1 + 2+ 3 = 6*/
using System;  
public class Exercise27  
{  
    public static void Main()
{
  int n,i,sum;
  
    Console.Write("\n\n");
    Console.Write("Check whether a given number is perfect number or not:\n");
    Console.Write("--------------------------------------------------------");
    Console.Write("\n\n");    

   Console.Write("Input the  number : ");
   n= Convert.ToInt32(Console.ReadLine());  
    sum = 0;
   Console.Write("The positive divisor  : ");
    for (i=1;i<n;i++)
      {
      if(n%i==0)
         {
         sum=sum+i;
         Console.Write("{0}  ",i);
         }
       }
    Console.Write("\nThe sum of the divisor is : {0}",sum);
    if(sum==n)
      Console.Write("\nSo, the number is perfect.");
    else
      Console.Write("\nSo, the number is not perfect.");
    Console.Write("\n");
  }
}