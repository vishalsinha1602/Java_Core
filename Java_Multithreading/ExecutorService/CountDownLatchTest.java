package Java_Multithreading.ExecutorService;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


//CountDownLatch is a synchronization aid that allows one or more threads to wait until a set of operations in other threads completes.
//
//        🧠 Key Concept
//It maintains a count, and threads wait on the latch until the count reaches zero.
//
//countDown() – Decrements the count.
//
//await() – Makes a thread wait until the count is zero.
//
//✅ Common Use Cases
//Waiting for multiple threads to finish before proceeding.
//
//Waiting for some resources to be initialized before starting work.
//
//Simulating a start signal for multiple threads (like a race).
public class CountDownLatchTest {
    public static void main(String[] args) throws InterruptedException {
        int n = 3;
        ExecutorService executorService = Executors.newFixedThreadPool(n);
        CountDownLatch latch = new CountDownLatch(n);
        executorService.submit(new DependentService(latch));
        executorService.submit(new DependentService(latch));
        executorService.submit(new DependentService(latch));
        latch.await(); // Makes a thread wait until the count is zero.
        System.out.println("Main");
        executorService.shutdown();
    }
}

class DependentService implements Callable<String> {
    private final CountDownLatch latch;
    public DependentService(CountDownLatch latch) {
        this.latch = latch;
    }
    @Override
    public String call() throws Exception {
        try {
            System.out.println(Thread.currentThread().getName() + " service started.");
            Thread.sleep(2000);
        } finally {
            latch.countDown();
        }
        return "ok";
    }
}
