package Java_Multithreading;
//void
//!start() : It is used to start the execution of the thread.
//void
//run() : It is used to do an action for a thread.
//static void
//!sleep() : It sleeps a thread for the specified amount of time.
//static Thread
//currentThread() :It returns a reference to the currently executing thread object.
//void
//join() : It waits for a thread to die.
//int
//!getPriority() : It returns the priority of the thread.
//void
//!setPriority() : It changes the priority of the thread.
//        String
//?getName() : It returns the name of the thread.
//void
//?setName() : It changes the name of the thread.
//long
//getId() :It returns the ID of the thread.
//boolean
//isAlive() :It tests if the thread is alive.
//static void
//yield()
//It causes the currently executing thread object to pause and allow other threads to execute temporarily.
//void
//suspend()
//It is used to suspend the thread.
//void
//resume()
//It is used to resume the suspended thread.
//void
//stop()
//It is used to stop the thread.
//void
//destroy()
//It is used to destroy the thread group and all of its subgroups.
//boolean
//isDaemon() :It tests if the thread is a daemon thread.
//void
//!setDaemon() : It marks the thread as a daemon or a user thread.
//void
//interrupt() : It interrupts the thread.
//boolean
//isinterrupted() :It tests whether the thread has been interrupted.
//static boolean
//interrupted() : It tests whether the current thread has been interrupted.
//static int
//activeCount()
//It returns the number of active threads in the current thread's thread group.
//void
//checkAccess()
//It determines if the currently running thread has permission to modify the thread.
//static boolean
//holdLock()
//It returns true if and only if the current thread holds the monitor lock on the specified object.
//static void
//dumpStack()
//It is used to print a stack trace of the current thread to the standard error stream.
//        StackTraceElement[]
//getStackTrace()
//It returns an array of stack trace elements representing the stack dump of the thread.
//static int
//enumerate()
//It is used to copy every active thread's thread group and its subgroup into the specified array.
//Thread.State
//getState()
//It is used to return the state of the thread.
//        ThreadGroup
//getThreadGroup()
//It is used to return the thread group to which this thread belongs
//String
//toString()
//It is used to return a string representation of this thread, including the thread's name, priority, and thread group.
//void
//notify()
//It is used to give a notification for only one thread that is waiting for a particular object.
//void
//notifyAll()
//It is used to give a notification to all waiting threads of a particular object.
//void
//setContextClassLoader()
//It sets the context ClassLoader for the Thread.
//ClassLoader
//getContextClassLoader()
//It returns the context ClassLoader for the thread.
//Static Thread.UncaughtExceptionHandler
//getDefaultUncaughtExceptionHandler()
//It returns the default handler invoked when a thread abruptly terminates due to an uncaught exception.
//static void
//setDefaultUncaughtExceptionHandler()
//It sets the default handler invoked when a thread abruptly terminates due to an uncaught
class MyThreads extends Thread{
    public MyThreads(String name)
    {
        super(name);

    }
    @Override
    public void run() {
        for (int i = 0; i <5 ; i++) {

            System.out.println(Thread.currentThread().getName()+"-->"+Thread.currentThread().getPriority()+ " is running");
            Thread.yield();// dushre thread ko mauka do


        }
        try {
            Thread.sleep(500); // this is t1 thread
        } catch (InterruptedException e) {
            System.out.println(e);
        }

    }
}

public class ThreadsMethod {
    public static void main(String[] args) throws InterruptedException {
        MyThreads t1 =new MyThreads("min");
        MyThreads t2 =new MyThreads("max");
        MyThreads t3 =new MyThreads("mid");

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);


        t1.start();
//        t1.interrupt();
        t2.start();
        t3.start();


    }
}
