package Java_Multithreading.ExecutorService;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

//
//🔸 What does Future let you do?
//When you submit a Callable (or Runnable) to an ExecutorService, you get a Future object. This object gives you powerful control:
//
//Method	Description
//get()	Waits and gets the result (blocks until done)
//get(timeout, unit)	Waits up to the timeout
//isDone()	Checks if the task has completed
//isCancelled()	Checks if the task was cancelled
//cancel(true/false)

//Feature	                                 Runnable	        Callable
//Works with Thread	                          ✅ Yes	         ❌ No
//Works with ExecutorService.submit(...)	  ✅ Yes	         ✅ Yes
//Returns result	                          ❌ No	             ✅ Yes
//Can throw checked exceptions	              ❌ No	             ✅ Yes

public class FutureTest {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<String> future = executorService.submit(() -> "Hello"); // callable parameter
        System.out.println(future.get()); // blocking call
        if(future.isDone()){
            System.out.println("Task is done !");
        }
        executorService.shutdown();
    }
}
