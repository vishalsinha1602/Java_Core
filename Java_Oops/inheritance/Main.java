package Java_Oops.inheritance;
// package Java_Oops;

// //! inheritance : one class inherit method and behaviour of other class( parent->child)

//! tightly coupled -> 

//? inheritance is -> is a relationship

class Animal{
    Boolean isAlive;
    String name;

    Animal(String name)
    {
        isAlive=true;
        this.name=name;

    }
    
    Animal()
    {
        isAlive=true;
        // this.name=name;

    }

    void eat()
    {
        System.out.println("eating.........");
    }
}

class Dog extends Animal{

    String name;

    Dog(String name){
        // super(name);
        this.name = name;
    }

}
public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog("labrador");

        System.out.println(dog.isAlive);
        dog.eat();
        
    }
    
}

