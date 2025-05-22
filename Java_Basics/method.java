package Java_Basics;
public class method {
    public static void main(String[] args) {
        
        System.out.println(add(3,5));
        System.out.println(add(3,5,9));
    }

    static double add( double a, double b)
    {
        return a+b;
    }
    static double add( double a, double b, double c)
    {
        return a+b+c;
    }
}
