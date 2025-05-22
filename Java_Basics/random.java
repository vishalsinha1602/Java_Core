package Java_Basics;
import java.util.Random;

public class random {
    public static void main(String[] args) {
        
        Random num = new Random();


        int a = num.nextInt(0,100);
        boolean b=num.nextBoolean();
        System.out.println(a);
        System.out.println(b);




    }
    
}
