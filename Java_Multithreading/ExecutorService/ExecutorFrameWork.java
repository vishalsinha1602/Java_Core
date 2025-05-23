package Java_Multithreading.ExecutorService;

//🔄 Thread Pooling in Java
//  Thread Pooling is a technique to manage and reuse a limited number of threads to execute multiple tasks efficiently. Instead of creating a new thread for every task, a pool of threads is maintained and r0eused,
//  which reduces overhead and improves performance, especially in applications that handle a large number of short tasks.
//! The Executors framework was introduced in Java 5 as part of the java.util.concurrent package to simplify the development
//!of concurrent applications by abstracting away many of the complexities involved in creating and managing threads.


//!It will help in
//
//?Avoiding Manual Thread management
//?Resource management
//?Scalability
//?Thread reuse
//?Error handling

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorFrameWork{

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        ExecutorService executor = Executors.newFixedThreadPool(9);
        for (int i = 1; i < 10; i++) {
            int finalI = i;
            executor.submit(() -> {
                long result = factorial(finalI);
                System.out.println(result);
            });

        }
        executor.shutdown();
        // executor.shutdown();
        try {
            executor.awaitTermination(1, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Total time " + (System.currentTimeMillis() - startTime));
    }

    private static long factorial(int n) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
