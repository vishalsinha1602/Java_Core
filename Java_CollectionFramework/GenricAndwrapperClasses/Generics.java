package Java_CollectionFramework.GenricAndwrapperClasses;

// Generics : Generics Means parametrized type. Using Generics, it is possible to create classes that works with different datatype.
// An entity such as class, interface or method that operates on a parameterized type in a generic entity.
public class Generics {
    public static void main(String[] args) {

        Dog<Integer,String> dog1 = new Dog<>(154 , "vishal");

        dog1.display();


    }
}

class Dog<E,V>{   // here it can generics data type

    E id;
    V name;

    Dog(E id , V name)
    {
        this.id=id;
        this.name=name;
    }

    void display()
    {
        System.out.println(this.id);
        System.out.println(this.name);
    }

}
