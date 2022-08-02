class Reverse extends Thread
{
     public void run()
     {
          try
          {
               System.out.println("\n=================================");
               System.out.println("\nReverse is: ");
               System.out.println("=================================");
               for (int i=10; i >= 1 ;i-- )
               {
                    System.out.print(i+"  ");
               }
               System.out.println("\n=================================\n\n");
          }
          catch (Exception ex)
          {
               ex.printStackTrace();
          }
     }
}