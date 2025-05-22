package Java_Oops.polymorphism;

// polymorphism : "POLY " : "MANY"
//                  "MORPH" : "SHAPE"
//object can identify as other objects
//objects can be treated as object of a common superclass

// Compile time polymorphism : in java method overloading is used for implementing compile time polymorphism

// Runtime Polymorphism (Dynamic method dispatch) : is a process in which a call to an overridden method is runtime rather than compile time.

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class Runtime {
    public static void main(String[] args) {
        Animal a;
        //! Upcasting
        a = new Dog();  // Reference of parent, object of child
        a.sound();// Output: Dog barks // it is decided at the runtime  known as method overring

        a = new Cat();
        a.sound();      // Output: Cat meows

        Dog myDog = (Dog)a; //! Downcasting
    }
}


