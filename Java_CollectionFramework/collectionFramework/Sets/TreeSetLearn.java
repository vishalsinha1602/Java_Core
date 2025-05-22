package Java_CollectionFramework.collectionFramework.Sets;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetLearn {

    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>(); // O(logn)

        // unique and sorted
        set.add(12);
        set.add(83);
        set.add(65);
        set.add(45);


        System.out.println(set);
    }
}
