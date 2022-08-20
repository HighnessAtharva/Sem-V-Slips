//  Write C# program to create structure called Book with title, author, publisher, and price as the fields of information. Create 2 books with this structure and print the details of these books.  

using System;

struct Books {
   public string title;
   public string author;
   public string publisher;
   public int price;
};  

public class testStructure {
   public static void Main(string[] args) {
      Books Book1;   /* Declare Book1 of type Book */
      Books Book2;   /* Declare Book2 of type Book */

      /* book 1 specification */
      Book1.title = "C Programming";
      Book1.author = "Nuha Ali"; 
      Book1.publisher = "C Programming Tutorial";
      Book1.price = 625;

      /* book 2 specification */
      Book2.title = "Telecom Billing";
      Book2.author = "Zara Ali";
      Book2.publisher =  "Telecom Billing Tutorial";
      Book2.price = 900;

      /* print Book1 info */
      Console.WriteLine( "Book 1 title : {0}", Book1.title);
      Console.WriteLine("Book 1 author : {0}", Book1.author);
      Console.WriteLine("Book 1 subject : {0}", Book1.publisher);
      Console.WriteLine("Book 1 book_id :{0}", Book1.price);

      /* print Book2 info */
      Console.WriteLine("Book 2 title : {0}", Book2.title);
      Console.WriteLine("Book 2 author : {0}", Book2.author);
      Console.WriteLine("Book 2 subject : {0}", Book2.publisher);
      Console.WriteLine("Book 2 book_id : {0}", Book2.price);       

   }
}