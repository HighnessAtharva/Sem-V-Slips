class s13a
{
     public static void main(String[] args)
     {
          try
          {
               Fibonacci fib = new Fibonacci();
               fib.start();
               fib.sleep(4000);
               Reverse rev = new Reverse();
               rev.start();
          }
          catch (Exception ex)
          {
               ex.printStackTrace();
          }
     }
}