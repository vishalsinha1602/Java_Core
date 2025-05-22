package Java_Oops.getterandsetter;

//! They help protect object data and add rule for accesing them.

//Getter : Method that make a fielf Readable
//Setter : Method that make a field Writable

 class Car{

    private final String model;
    private String color;
    private int price;

    Car(String model , String color, int price)
    {
        this.model=model;
        this.color=color;
        this.price=price;
    }

    //! getter
    String getModel()
    {
        return this.model;

    }
    String getColor()
    {
        return this.color;

    }
    int getPrice()
    {
        return this.price;

    }

    //!setter
    void setColor(String color)
    {
        this.color=color;
    }




}

public class getterSetter {
    public static void main(String[] args) {

        Car car = new Car("Baleno", "red", 3930);

        // car.model="fortuner";

        car.setColor("green");

        System.out.println(car.getColor());
        System.out.println(car.getModel());
        System.out.println(car.getPrice());  
        // can't access them because it is private

        //! we can do it with help of getter and setter method
        
    }
    
}
