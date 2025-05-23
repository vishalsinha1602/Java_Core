package Java_Multithreading;
//🔍 volatile Keyword in Java
//The volatile keyword in Java is used for thread-safe visibility of variables between threads. It ensures that changes made by one thread to a variable are immediately visible to other threads.
//
//🧠 Why is volatile Needed?
//In a multithreaded environment, threads may cache variables for performance. This can lead to stale or inconsistent values if one thread modifies a variable and another thread doesn't see the updated value.
//
//        ✅ volatile prevents this by:
//
//Always reading/writing from main memory (not from thread-local cache).
//
//        Guaranteeing visibility, not atomicity.


// volatile keyword made is not save in cache
class SharedObj {
    private volatile boolean flag = false;

    public void setFlagTrue() {
        System.out.println("Writer thread made the flag true !");
        flag = true;
    }

    public void printIfFlagTrue() {
        while (!flag) {
            // do nothing
        }
        System.out.println("Flag is true !");
    }
}

public class VolatileTest {
    public static void main(String[] args) {
        SharedObj sharedObj = new SharedObj();

        Thread writerThread = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            sharedObj.setFlagTrue();
        });

        Thread readerThread = new Thread(() -> sharedObj.printIfFlagTrue());

        writerThread.start();
        readerThread.start();
    }
}
