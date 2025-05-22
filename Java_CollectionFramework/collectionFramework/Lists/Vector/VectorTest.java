package Java_CollectionFramework.collectionFramework.Lists.Vector;

import java.util.LinkedList;
import java.util.Vector;

public class VectorTest {
    public static void main(String[] args) {
        // synchronized

        //constructor
        Vector<Integer> vector = new Vector<>();
        //capacity 10, sie 0;
        System.out.println(vector.capacity());
        // increase it double 2x when limit reaches

        //collection

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(3);
        linkedList.add(5);
        Vector<Integer> vector1 = new Vector<>(linkedList);
        System.out.println(vector1);

        // methods
        //add
        //get
        //set
        //remove
        //size
        //isEmpty
        //contains
        //clear

        linkedList.clear();

        //synchronisation and performance



    }
}
