package Java_Basics;

// Varargs stands for Variable-length Arguments. It allows you to pass a variable number of arguments to a method.
public class varargs {
    public static void main(String[] args) {


        System.out.println(add(1,2,3,4));

      
        
    }
    static int add(int... number)
    {
        int sum =0;
        
        for(int num : number)
        {
            sum+=num;
        }


        return sum;
        

    }
    
}
