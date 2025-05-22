package Java_Oops.association;

class Engine{
    int price;

}

class Car{ // we do not use extends (is a) here otherwise it will tightly coupled and dependent

    //loosely coupled and independent

    Engine e;

    Car() {
        e = new Engine();
        e.price = 123;
       
    }

}

public class Association {

    public static void main(String[] args) {

         Car car = new Car();
       
        
    }
    
}
