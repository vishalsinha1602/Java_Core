package Java_CollectionFramework.collectionFramework.Lists;

import java.util.ArrayList;
import java.util.List;

// JAVA LIST INTERFACE

// The list interface extends the collection interface and adds method that are specific to lists , which are ordered collection that allow duplicate elements.
// Here are some methods that's are present int the list interface but not in the collection interface:

public class LearnLists {
    public static void main(String[] args) {

        List<Integer> list= new ArrayList<>();
        list.add(23);
        list.add(21);

        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.contains(334));
        System.out.println(list.get(1));
        System.out.println(list.set(2,30));




    }
}
