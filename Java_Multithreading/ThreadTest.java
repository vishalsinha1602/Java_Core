package Java_Multithreading;

//class World extends Thread{ // world extends Thread class
//    @Override
//    public void run() {
//        for(int i=0;i<100;i++)
//        {
//            System.out.println("world");
//        }
//
//    }
//}

// implements Runnable interface
class World implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<100;i++)
        {
            System.out.println("world");
        }

    }
}


public class ThreadTest {
    public static void main(String[] args) {

        World world = new World(); // New State
        Thread t1 = new Thread(world); // to run Runnable interface
        t1.start(); //Runnable -> Running state



        for(int i=0;i<100;i++)
        {
            System.out.println("hello");

        }

    }
}
