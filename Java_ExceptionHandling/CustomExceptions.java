package Java_ExceptionHandling;

import java.util.Scanner;

//throw keyword is used to explicitly throw a single exception (custom exception)

public class CustomExceptions {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age :");

        try{
            int age = scanner.nextInt();
            if(age>100)
            {
                throw new MyException("More than 100 not allowed");
            }
        }catch (Exception e)
        {
            System.out.println(e);

        }
        finally {
            scanner.close();
        }


    }

}

class MyException extends  Exception{

    public MyException( String message)
    {
        super(message);
    }

}
