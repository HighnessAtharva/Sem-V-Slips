/*Write a JAVA program which will generate the threads: 

- To display 10 terms of Fibonacci series.
- To display 1 to 10 in reverse order.        */

class Fibonacci extends Thread {
     public void run() {
          try {
               int a = 0, b = 1, c = 0;
               int n = 10;
               System.out.println("Fibonacci series:");
               while (n > 0) {
                    System.out.print(c + " ");
                    a = b;
                    b = c;
                    c = a + b;
                    n = n - 1;
               }
          } catch (Exception ex) {
               ex.printStackTrace();
          }
     }
}

class Reverse extends Thread {
     public void run() {
          try {
               System.out.println("\nReverse is: ");
               for (int i = 10; i >= 1; i--) {
                    System.out.print(i + "  ");
               }
          } catch (Exception ex) {
               ex.printStackTrace();
          }
     }
}

class s13a {

     public static void main(String[] args) {
          try {
               Fibonacci fib = new Fibonacci();
               fib.start();
               fib.sleep(2000);
               Reverse rev = new Reverse();
               rev.start();
          } catch (Exception ex) {
               ex.printStackTrace();
          }
     }
}
