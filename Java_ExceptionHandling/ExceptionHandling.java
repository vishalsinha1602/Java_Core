package Java_ExceptionHandling;

//unexpected events occur during the program execution.

//java runtime exception --> runtime --> its developer fault
//java i/o exception --> compile time
// try->catch->finally --> throw --> throws
// can be multiple catch block
// can't be multiple finally block

// finally block is basically used for closing file or connection

// note:  there are some cases where finally block doesn't execute :
// use of system.exit() method
// an exception occurs in the finally block
//The death of thread

public class ExceptionHandling {
    public static void main(String[] args) {
        Integer [] arr= new Integer[5];

//        try{
////            System.out.println("hello vishal");
//
//
////            int div =1/0;
//            System.out.println(arr[2]);
//
//
//        }
//        catch (ArrayIndexOutOfBoundsException e)
//        {
//            System.out.println(e);
//        }
//        catch (ArithmeticException e) {
//
//            System.out.println(e);
//
//        }finally {
//            System.out.println("i will run always");
//        }
//
//        System.out.println("bye bye");

try{
    getNumberFromArray(arr);

}catch (ArrayIndexOutOfBoundsException e)
{
    System.out.println("Exception caught");
}




    }

    static int getNumberFromArray(Integer[] arr) throws ArrayIndexOutOfBoundsException{
        return arr[8];
    }
}
