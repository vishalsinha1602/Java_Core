package Java_Oops.association.aggregation;

//! Aggregation : Represent a " Has-a" Relationship between object.

//? loosely coupled -> week Bounding car->Driver
//one object contain another object as a part of its structure
// but the contained object can exist independently

class Library{

   
}

class Book {

    String title;
    int pages;

    Book(String title, int pages){
        this.title=title;
        this.pages=pages;
    }

    String displayInfo()
    {
        return this.title + " " + this.pages;
    }

}

public class Main {
    public static void main(String[] args) {

         Book book1 =new Book("Three mistake og life",987);
         
         System.out.println(book1.displayInfo());

        
    }
}
