/*Write a java program which will display name and priority of current thread. 
Change name of Thread to MyThread and priority to 2. Display the details of Thread. */

class s6a {
    public static void main(String a[]) {
        String S;
        int p;
        Thread t = Thread.currentThread();
        S = t.getName();
        System.out.println("Current Thread name : " + S);
        p = t.getPriority();
        System.out.println("Current thread priority : " + p);

        System.out.println("-------AFTER CHANGE--------");

        t.setName("My Thread");
        S = t.getName();
        System.out.println("Changed Name : " + S);
        t.setPriority(2);
        p = t.getPriority();
        System.out.println("Changed Priority : " + p);

    }
}