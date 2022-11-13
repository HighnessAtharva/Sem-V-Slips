/*Write a java program using multithreading to execute the threads sequentially.
(Use Synchronized Method)	*/

class PrintDemo {
    public void printCount() {
        try {
            for (int i =0 ; i<=5 ; i++) {
                System.out.println("Counter: " + i);
            }
        } catch (Exception e) {
            System.out.println("Thread interrupted.");
        }
    }
}

class ThreadDemo extends Thread {

    private Thread t;
    private String threadName;
    PrintDemo PD;

    ThreadDemo(String name, PrintDemo pd) {
        threadName = name;
        PD = pd;
    }

    public void start() {
        System.out.println("Starting " + threadName);
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }
    
    public void run() {
        synchronized (PD) {
            PD.printCount();
        }
        System.out.println("Thread " + threadName + " exiting.");
    }

 
}

public class s18a {
    public static void main(String a[]) {
        PrintDemo PD = new PrintDemo();
        ThreadDemo T1 = new ThreadDemo("First ", PD);
        ThreadDemo T2 = new ThreadDemo("Second", PD);
        T1.start();
        T2.start();
        // // wait for threads to end
        // try {
        //     T1.join();
        //     T2.join();
        // } catch (Exception e) {
        //     System.out.println(e);
        // }
    }
}