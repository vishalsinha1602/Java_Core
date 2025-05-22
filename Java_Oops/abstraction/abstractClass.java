package Java_Oops.abstraction;

//! data hiding not fot the security reason but for the complexity reasons
// Hiding the complexity of code from the user


//! Abstract  :  Use to define abstract classes and   methods;

//! Abstraction is the process of hidind the implementation details and showing only the essential feature;

//Abstraction class can't be instantiated directly
// Can contain 'abstract' method ( which must be implemented)
// can contain 'concrete' method (which are inherited)


//!Abstraction can be achieved by abstract classes and interface class both

abstract class Shape {

    abstract double area(); // it can be implemted by children class only

    //! abstarct class can have concrete method but interface by default all function are abstarct and public
    void display()
    {
        System.out.println("this is shape");
    }




}

class Circle extends Shape{


    double radius;
     
    Circle(double radius){
        this.radius=radius;
    }



    @Override
    double area()
    {
        return Math.PI*radius*radius;
    }

}

 class Triangle extends Shape{

    double base;
    double height;

    Triangle(double base , double height)
    {
        this.base=base;
        this.height=height;
    }



    @Override
     double area()
    {
        return 0.5*base*height;
    }

}

 class Rectangle extends Shape{

    double length;
    double breadth;

    Rectangle (double length , double breadth){
        this.length=length;
        this.breadth=breadth;
    }




    @Override
    double area()
    {
        return length*breadth;
    }
    
}



public class abstractClass {
    public static void main(String[] args) {

        // Shape shape = new Shape(); //! can not be instantiated because of abstract class

        Circle circle = new Circle(5);
        Triangle triangle = new Triangle(4,10);
        Rectangle rectangle = new Rectangle(4,5);

      System.out.println(circle.area());
      System.out.println(triangle.area());
      System.out.println(rectangle.area());
     
    }
    
}
