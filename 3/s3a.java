/*Write a java program to display “Hello Java” message n times on the screen. (Use Runnable Interface). */

import java.util.Scanner;

class JavaThread extends Thread {
    public void run() {
        try {
            System.out.println("Enter No of times to print Hello Java");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            sc.close();
            int counter = 1;
            for (int i = 0; i < n; i++) {
                System.out.println("Hello Java | Count: " + counter);
                Thread.sleep(100);
                counter = counter + 1;
            }
        } catch (InterruptedException e) {
            System.out.println("Exception");
        }
    }
}

public class s3a {
    public static void main(String[] args) {
        JavaThread jt = new JavaThread();
        jt.start();
    }
}
