package Java_Basics;
import java.util.Scanner;

public class temp {

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        int choice;
        double Farenheit;
        double Celcius;

       

        System.out.println("Enter the tempreture :");
        double temp = input.nextDouble();

        System.out.println("choose one ?");
        System.out.println("1.Farenheit");
        System.out.println("2.Celcius");
        choice=input.nextInt();

        Farenheit=(temp-32)*5/9;
        Celcius=(temp*9/5)+32;

        double result = (choice==1)?Farenheit:Celcius;

        System.out.printf("%.2f  F",result);
        



        input.close();



    
        
        
    }
    
}
