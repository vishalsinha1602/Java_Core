package Java_Basics;

import java.util.Scanner;

public class whiletest {
    public static void main(String[] args) {
        String userInput="";

        Scanner input = new Scanner(System.in);

        userInput = input.nextLine();

        while(!userInput.equals("exit"))
        {
            System.out.print("Enter something (type 'exit' to quit): ");
            userInput = input.nextLine();
        }
        
        

        input.close();


    }
    
}
