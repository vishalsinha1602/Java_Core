package Java_CollectionFramework.GenricAndwrapperClasses;

// Wrapper classes
// Autoboxing and unboxing
// Generics
//Bounded Generics

// Wrapper Classes : A wrapper class in java is a class whose  object wraps or contains primitive data types. when we create an object to a wrapper class .
//Need of wrapper classes
//1. The classes in java.util package used only objects.
//2. Data structure in collection framework  , such as arraylist and vector , store only objects (reference type ) and not primitive type

public class Wrapper {

    public static void main(String[] args) {

        //Autoboxing

//      Integer a = new Integer(123);
        Integer obj = Integer.valueOf("124");

//Autoboxing
        Integer a = 12;

        // unboxing

        int obj1 =a;


    }
}
