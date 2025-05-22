package Java_Basics;

import java.util.Scanner;

public class input {

    public static void main(String[] args) {
        
        Scanner input= new Scanner(System.in);  
        
        System.out.print("Enter your Name : ");
        String name=input.nextLine();

        System.out.println("hello " + name);

        input.close(); // closing is imp otherwise it may show unexpected result
    }
    
}
