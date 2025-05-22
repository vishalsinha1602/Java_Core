package Java_Multithreading;

//! Two type of lock
//? Intrinsic and Explicit Lock
//* These are built into every object in java. you don't see them, but they are there .
//* when you use a synchronized keyword you are using these automatic locks
//! synchronized lock are Intrinsic Locks

//! Explicit Locks : These are the more advance locks you can control yourself using the locks class from java.util.concurrent.locks.
//! you Explicit say when to lock and unlock , giving you more control over how and when people can write in the critical section

//class BankAccount {
//    private int balance = 100;
//
//    public  synchronized void withdrawl(int amount) {
//        System.out.println(Thread.currentThread().getName() + " attempting to withdraw " + amount);
//        if (balance >= amount) {
//            System.out.println(Thread.currentThread().getName() + " Processing with withdrawal ....");
//
         //! it can be possible it can wait for longer time // we can't control it so we use explicit lock
//            try {
//                Thread.sleep(10000);
//            } catch (InterruptedException e) {
//            }
//            balance -= amount;
//            System.out.println(Thread.currentThread().getName() + " completing withdrawal , Remaining balance :" + balance);
//        } else {
//            System.out.println(Thread.currentThread().getName() + "Insufficient Balance");
//        }
//
//    }
//}

//! USING EXPLICIT LOCK

// TYPE ON Reentrant LOCK METHOD // implement a lock counter
// LOCK.LOCK() // same as synchronized wait untill found
//LOCK.TRYLOCK()
//lOCK.Unlock()
//lock,lockInterruptibly()
// deadlock preventation

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class BankAccount {
    private int balance = 100;

    private  final Lock lock = new ReentrantLock();

    public void withdrawl(int amount) {
        System.out.println(Thread.currentThread().getName() + " attempting to withdraw " + amount);
        try {
            if(lock.tryLock(1000, TimeUnit.MILLISECONDS))
            {
                if (balance >= amount) {
                    System.out.println(Thread.currentThread().getName() + " Processing with withdrawal ....");

                    //! it can be possible it can wait for longer time // we can't control it so we use explicit lock
                    try {
                        Thread.sleep(10000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }finally {
                        lock.unlock();
                    }
                    balance -= amount;
                    System.out.println(Thread.currentThread().getName() + " completing withdrawal , Remaining balance :" + balance);
                } else {
                    System.out.println(Thread.currentThread().getName() + "Insufficient Balance");
                }

            }else{
                System.out.println(Thread.currentThread().getName() + " server fail try again later");

            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();

        }

    }
}


    public class LocksTest {
        public static void main(String[] args) {
            BankAccount bankAccount = new BankAccount();

            Runnable task = new Runnable() {
                @Override
                public void run() {
                    bankAccount.withdrawl(50);
                }
            };

            Thread t1 = new Thread(task, "Thread1");
            Thread t2 = new Thread(task, "Thread2");
            t1.start();
            t2.start();
        }
    }


