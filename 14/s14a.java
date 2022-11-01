// Write a program to demonstrate the join() in multithreading 

public class s14a extends Thread {
    // invoking the start() method of the Thread class begins the run() method of
    // the thread.
    public void run() {
        for (int i = 1; i <= 4; i++) {
            try {
                Thread.sleep(500);
                System.out.println(i);
            } catch (Exception e) {
                System.out.println(e);
            }

        }
    }

    public static void main(String args[]) {
        // creating three threads
        s14a t1 = new s14a();
        s14a t2 = new s14a();
        s14a t3 = new s14a();
        // thread t1 starts
        t1.start();

        // starts second thread when first thread t1 is died.
        try {
            t1.join();

            // start t2 and t3 thread
            t2.start();
            t3.start();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}