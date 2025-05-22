package Java_Oops.abstraction;

//? Abstraction can be achieved by interface also 

//! Interface :  A blueprint for a class that specifies a set of abstract class that implementing classes Must define.

//! Support multiple inheritance like behaviour

interface Car{

    //? by default interface ke ander sare method public  and abstract hote hai 

    //! true abstraction 
    void start();
}

class Audi implements Car {
    @Override
    public void start() {
        System.out.println("Audi started.");
    }
}

//! in java ek class multiple class inheritance nhi kar skta , is liye hmlog interface uses kr skte kunki ki ye multiple class ko impelement kr skata hai


public class interfaceClass {
    public static void main(String[] args) {

        
        
    }
    
}
