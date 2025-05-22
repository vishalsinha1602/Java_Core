package Java_Basics;

public class twodarray {

    public static void main(String[] args) {
        
        String[][] name= {  {"vishal","aayush","mukul"},
                            {"vishal","aayush","mukul"},
                            {"vishal","aayush","mukul"},
    
                        };

        // char[][] telephone ={
        //                     {'1', '2', '3'},
        //                     {'4', '5', '6'},
        //                     {'7', '8', '9'},
        //                     {'*', '0', '#'}
        //                     };

        //     for (char[] row : telephone) {

        //         for (char num : row) {

        //             System.out.print(num+" ");
                    
        //         }
        //         System.out.println();
                
        //     }

        for (String[] identity : name) {
            for (String nm  : identity) {

                System.out.print(nm+" ");
                
            }
            System.out.println();
            
        }


    }
    
}
