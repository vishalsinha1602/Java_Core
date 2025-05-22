package Java_Oops;

//! toString() :  toString method inherited from Object Class 
// har class ka parent hai object class( )
//used to return a string representation of an object'
// By default it return a hash code as a unique identifier.
// It can be overriden to provide meaningful details.


class Bike
{
    String model;
    int year;
    String color;

    Bike(String model,int year , String color)
    {

        this.model=model;
        this.year=year;
        this.color=color;

    }

    @Override
    public String toString()
    {
        return this.model + " " +this.color + " " + this.year;

    }

}

public class tostringMethod {

    public static void main(String[] args) {
        
        Bike b1 =new Bike("yamaha",1947 ,"red" );
        System.out.println(b1);


    }


    
}
