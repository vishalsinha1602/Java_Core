
//There are three types of variable
//1. Local variable : inside the method
//2. Instance Vriable : inside class outside method
//3. Static Vriable : 

package Java_Basics;

class variable
{
    int a;//instance variable
    int b;//instance variable

    static int value;

     void sum()
    {
        int ans; //local variable

        this.a=7;
        this.b=9;
        ans=a+b;
        System.out.println(ans);

      
    }
}

public class variables {

    public static void main(String[] args) {

        variable v1=new variable();
        v1.sum();
        variable.value=10;
        variable.value=334;
        System.out.println(variable.value);
        System.out.println(variable.value);
        
        

        
    }
    
}
