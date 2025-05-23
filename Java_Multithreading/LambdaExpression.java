package Java_Multithreading;

public class LambdaExpression {
    public static void main(String[] args) {
//!        Runnable task = new Runnable() {
//!            @Override
//!            public void run() {
//!               System.out.println("hello");
//!            }
//!        };
//!        Thread t1 = new Thread();
//!        t1.start();

//?LAMBDA EXPRESSION -> FUNCTIONAL -> INTERFACE
        Thread t1 = new Thread(() -> System.out.println("hello"));
        t1.start();

//!        Thread t1 = new Thread(()->{
//!            System.out.println("hello");
//!           System.out.println("world");
//!       } );
//!        t1.start();

    }
}
