package Java_Multithreading;

import java.util.concurrent.atomic.AtomicInteger;

//Atomic classes provide a way to perform thread-safe operations on single variables without using synchronized blocks.
//
//They rely on low-level atomic CPU instructions (CAS - Compare and Swap) for high performance in concurrent environments.
//
//✅ Common Atomic Classes
//Class	Description
//AtomicInteger	For int values
//AtomicLong	For long values
//AtomicBoolean	For boolean values
//AtomicReference<V>	For objects of any type
//AtomicIntegerArray, AtomicLongArray	For atomic arrays

//! you can use synchronised but there is option to atomic class

public class AtomicClassTest {
    private AtomicInteger counter = new AtomicInteger(0);

    public void increment() {
        counter.incrementAndGet();
    }

    public int getCounter() {
        return counter.get();
    }

    public static void main(String[] args) throws InterruptedException {
        AtomicClassTest vc = new AtomicClassTest();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                vc.increment();
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                vc.increment();
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(vc.getCounter());
    }

}
