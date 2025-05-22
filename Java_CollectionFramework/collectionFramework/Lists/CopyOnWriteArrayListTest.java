package Java_CollectionFramework.collectionFramework.Lists;
import java.util.ArrayList;
import java.util.List;
import  java.util.concurrent.CopyOnWriteArrayList;
public class CopyOnWriteArrayListTest {
    public static void main(String[] args) {

        CopyOnWriteArrayList<String>list  = new CopyOnWriteArrayList<>();

        // "copy on write  " means that whenever a write operation
        // like adding or removing of an element
        // instead of directly modifying the existing list
        // a new copy of the list is created , and the modification is applied to that copy
        // This ensure that the other thread reading that list while it's being modified are unaffected.


        // Read operation : First and direct , since they happens on a stable list without interference from modifications
        // Write operation : A new copy of the list is created for every modification.
        // The reference to the list is then updated so that subsequent reads use this new lists.

        //error not thread safe
//        List<String> list1 = new ArrayList<>();
//
//        list1.add("milk");
//        list1.add("bread");
//        list1.add("egg");
//        for( String items : list1)
//        {
//            System.out.println(items);
//            if(items.equals("bread"))
//            {
//                list1.add("butter");
//                System.out.println("added");
//
//            }
//
//        }
//
//        System.out.println(list1);



        list.add("milk");
        list.add("bread");
        list.add("egg");
        for( String items : list)
        {
            System.out.println(items);
            if(items.equals("bread"))
            {
                list.add("butter");
                System.out.println("added");

            }

        }

        System.out.println(list);


    }
}
