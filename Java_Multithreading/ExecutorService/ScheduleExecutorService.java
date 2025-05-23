package Java_Multithreading.ExecutorService;


//!The ScheduledExecutorService in Java is part of the java.util.concurrent package and is
//!used to schedule tasks to run after a delay or periodically — like a timer with thread pool support.

//Methods Overview
//Method	Purpose
//schedule()	Runs a task once after a delay
//scheduleAtFixedRate()	Runs periodically at fixed intervals
//scheduleWithFixedDelay()	Runs periodically with delay between execute

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduleExecutorService {
    public static void main(String[] args) {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        Runnable task = () -> System.out.println("Running task at " + System.currentTimeMillis());

        // Schedule to run once after 3 seconds
        scheduler.schedule(task, 3, TimeUnit.SECONDS);


        scheduler.shutdown();
    }
}
