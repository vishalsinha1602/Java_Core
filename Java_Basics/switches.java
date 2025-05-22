package Java_Basics;

public class switches {
    public static void main(String[] args) {
        
        String day ="saturday";

        switch (day) {
            case "monday" -> System.out.println(" monday blue");
            case "tueday" -> System.out.println("it's a weekday");
            case "wednesday" -> System.out.println("no gym");

            default -> System.out.println("go to gym");
        } 
    }
    
}
