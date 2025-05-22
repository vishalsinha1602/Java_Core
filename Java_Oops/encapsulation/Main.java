package Java_Oops.encapsulation;

// Access Modifier
// public private  protected 
// by default (no modifier) ; accessible only with the same packages
// private : accessible only with in the same class
// Public: Accessible from any class, anywhere.
// Protected: Accessible within the same package and by subclasses in other packages.

class Laptop{
    int ram;
    private int price;

    public void setPrice(int price)
    {
        boolean isAdmin=true;
    if(!isAdmin)
    {
        System.out.println("you are not admin");

    }
    else{
        this.price=price;
    }
   
    }


    int getPrice()
    {
        return price;
    }

    

}

public class Main {
    public static void main(String[] args) {

        Laptop l1 = new Laptop();
        l1.setPrice(394);
        System.out.println(l1.getPrice());
        


        
    }

 
}
