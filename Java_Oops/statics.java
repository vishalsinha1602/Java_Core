package Java_Oops;

//! Static : Make a variable or method belong to that class
//          rather than to a specific object
//          commonly used for utility method or shared resources

class Friend{

    static int numOfFriend;
    String name;

    Friend(String name)
    {
        this.name=name;
        numOfFriend++;

    }
}

public class statics {
    public static void main(String[] args) {

        // Friend friend1 = new Friend("vishal");
        // Friend friend2 = new Friend("aayush");
        // Friend friend3 = new Friend("aayushi");
        System.out.println(Friend.numOfFriend); // call static memeber or method ny class name
        
    }
}
