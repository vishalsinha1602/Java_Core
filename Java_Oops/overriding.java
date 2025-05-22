package Java_Oops;


//! Method Overloading : When a Subclass provides its own implementation of a method 
//                      that is already defined.
//                      Allow for code reusability and give specific implementation


class Animals{

  void move()
    {
        System.out.println("This animal is running");
    }

}

class Dog extends Animals{

}

class Fish extends Animals
{

    
    @Override
    void move() {
        System.out.println("This animal is Swimming");
    }

}

class Cat extends Animals{

}

public class overriding {
    public static void main(String[] args) {

        // Animals animal = new Animals();
        Fish fish = new Fish();
        Dog dog = new Dog();
        Cat cat = new Cat();


        fish.move();
        dog.move();
        cat.move();
        
    }
}
