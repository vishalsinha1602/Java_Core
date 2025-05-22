package Java_Multithreading;

class Counter {
    public static int count = 0;



    //! critical section

//    public void increment() {
// ! not a synchronised functi on inconsistent result
//        count++;
//        }

//   public  void  increment() {
//        synchronized{
//
//          count++;
    //* synchronized block
//
//        }

//}

    public synchronized void  increment() {   //?  A synchronised function consistent result
        count++;
    }

    public int getCount() {
        return count;
    }

}

class MyThreadSync extends Thread {
    private Counter counter;

    public MyThreadSync(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {

            counter.increment();
            ;

        }

    }


}



public class ThreadSynchronization {
    public static void main(String[] args)  {
        Counter counter = new Counter();
        MyThreadSync t1 = new MyThreadSync(counter); //! two thread one object
        MyThreadSync t2 = new MyThreadSync(counter);
        t1.start();
        t2.start();

        try {
            t1.join(); //! wait untill complete
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("exception");
        }

        System.out.println(counter.getCount());





    }
}
