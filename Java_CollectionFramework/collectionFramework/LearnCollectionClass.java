package Java_CollectionFramework.collectionFramework;

import java.util.*;

public class LearnCollectionClass {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(12);
        list.add(22);
        list.add(76);
        list.add(12);

        System.out.println(Collections.min(list));
        System.out.println(Collections.max(list));

        Collections.sort(list, Comparator.reverseOrder());
        System.out.println(list);



    }
}
