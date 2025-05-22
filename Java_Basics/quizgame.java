package Java_Basics;

import java.util.Scanner;

public class quizgame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] question={"1. Who is the father of computer ?",
                            "2. Who is the father of england  ?",
                            "3. Who is the father of australia ?"
                        };

        String[][] option = {{"1.mukul","2.vishal","3.aditya","4.gaurav"},
                             {"1.mukul","2.vishal","3.aditya","4.gaurav"},
                             {"1.mukul","2.vishal","3.aditya","4.gaurav"}
                            };

        int[] answer ={1,2,3};

        int guess;
        int score=0;


        for(int i=0;i<question.length;i++)
        {
            System.out.println(question[i]);
            for(int j=0;j<option.length;j++)
            {
                System.out.println("      "+option[i][j]);
            }

            System.out.print("Answer : ");
            guess = scanner.nextInt();
            // String correct =(guess==answer[i])?"correct" score++ :"false";
            // System.out.println(correct);
           

            if(guess==answer[i])
            {
                System.out.println("correct");
                score++;
            }
            else
            {
                System.out.println("false");
            }
            System.out.println();

        }

        System.out.println("Your Scorecard");
        System.out.printf("Your score %d Out of %d",score,question.length);

        

        // for (String i : question ) {

        //     System.out.println(i);

        //     for (String[]  j: option ) {

        //         System.out.println);
                
        //     }
            
        // }











        scanner.close();
    }
}