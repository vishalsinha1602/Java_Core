package Java_Basics;
import java.util.Random;
import java.util.Scanner;


public class rockgame {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String computerChoice;
        String playerChoice;
        String playAgain="yes";

        String[] game ={"rock","paper","scissors"};
        computerChoice= game[random.nextInt(3)];
        System.out.println();

        do{

        System.out.print("Choose : ( Rock , Paper , Scissors ) : ");
        playerChoice=scanner.nextLine().toLowerCase();
        System.out.printf("Bot Chooses : %s",computerChoice);
    
        System.out.println();
        if(playerChoice.equals(computerChoice))
        {
            System.out.println("\n --------------- YOU WIN ------------------- ");
        }
        else
        {
            System.out.println("\n --------------- YOU LOSE ------------------ ");
        }
        
        System.out.print(" \n Play Again ( Yes or No ) : ");
        playAgain=scanner.nextLine().toLowerCase();
        System.out.println("\n\n");


        }while(playAgain.equals(playAgain));
        

scanner.close();


        
    }
    
}
