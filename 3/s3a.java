import java.util.Scanner;

class JavaThread implements Runnable {
    Thread t1;

    JavaThread(String s) {
        t1 = new Thread(this, s);
        System.out.println("Name of the Thread=" + t1.getName());

        t1.start();
    }

    public void run() {
        try {
            System.out.println("Enter N");
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
        JavaThread jt = new JavaThread("Java Thread");
    }
}
