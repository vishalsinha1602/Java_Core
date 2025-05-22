package Java_Basics;

import java.util.Scanner;

public class array {

    public static void main(String[] args) {
        

        // String[] fruits;
        // System.out.println(fruits); // this will give us memory address
        //access by indexing
        // System.out.println(fruits[0]);

        //length
        // int numOfFruits=fruits.length;
        // System.out.println(numOfFruits);

        //searching 

        // for(int i=0 ; i<numOfFruits;i++)
        // {
        //     System.out.print(fruits[i]+" ");
        // }

        //using foreach loop

        // for( String fruit : fruits)
        // {
        //     System.out.print(fruit+" ");
        // }

        String[] fruits = new String[3];

        Scanner scanner = new Scanner(System.in);

        for (int i=0;i<fruits.length;i++) {

            System.out.println("enter fruits name : ");
            fruits[i]=scanner.nextLine();
        }

        for (String food : fruits) {

            System.out.print(food + " ");
            
        }



        scanner.close();



    }
    
}
