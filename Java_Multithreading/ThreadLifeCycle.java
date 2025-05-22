package Java_Multithreading;

class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("Running");
        try {
            Thread.sleep(200); // this is t1 thread
        } catch (InterruptedException e) {
            System.out.println(e);
        }

    }
}
public class ThreadLifeCycle {
    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();
        System.out.println(t1.getState());// New state
        t1.start();
        System.out.println(t1.getState()); //Runnable -> Running
//        System.out.println(Thread.currentThread().getState()); // main thread state
        // to access main thread use Thread.currentThread()
        Thread.sleep(100);
        System.out.println(t1.getState());
        t1.join();
        System.out.println(t1.getState());
    }
}
