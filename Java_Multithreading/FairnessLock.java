package Java_Multithreading;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class UnfairLock{
//     private final Lock unfairLock = new ReentrantLock();
    // fair true means fifo implements and give time to all thread --> no starvation
     private final Lock fairLock = new ReentrantLock(true);



     public void accessResource(){
//        unfairLock.lock();
        fairLock.lock();

         try {
             System.out.println(Thread.currentThread().getName()+ " acquiring lock");
             Thread.sleep(1000);
         } catch (InterruptedException e) {
             Thread.currentThread().interrupt();
         }finally {
             System.out.println(Thread.currentThread().getName()+ " Releasing the lock");
//             unfairLock.unlock();
             fairLock.unlock();
         }

     }


}

public class FairnessLock {
    public static void main(String[] args) {

        UnfairLock unFairlock = new UnfairLock();

        Runnable task = new Runnable() {
            @Override
            public void run() {
                unFairlock.accessResource();
            }
        };

        Thread t1 = new Thread(task ,"Thread 1");
        Thread t2 = new Thread(task ,"Thread 2");
        Thread t3 = new Thread(task ,"Thread 3");
        Thread t4 = new Thread(task ,"Thread 4");
        Thread t5 = new Thread(task ,"Thread 5");
        Thread t6 = new Thread(task ,"Thread 6");
        Thread t7 = new Thread(task ,"Thread 7");
        Thread t8 = new Thread(task ,"Thread 8");
        Thread t9 = new Thread(task ,"Thread 9");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();


    }
}
