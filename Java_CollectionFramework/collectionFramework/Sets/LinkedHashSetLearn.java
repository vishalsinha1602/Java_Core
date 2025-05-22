package Java_CollectionFramework.collectionFramework.Sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetLearn {
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();
        set.add(12);
        set.add(23);
        set.add(65);
        set.add(45);


        System.out.println(set);
    }

}
