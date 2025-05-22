package Java_CollectionFramework.collectionFramework.Lists.ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//class SortingIntegerByComparator implements Comparator<Integer>{
//
//    @Override
//    public int compare(Integer o1, Integer o2) {
//        return o2-o1;
//    }
//
//    // if int(-ve) o1->o2
//    // if int(0) o1=o2
//    // if int(+ve) o2->o1
//}
//
//class SortingStringByComparator implements Comparator<String>{
//
//    @Override
//    public int compare(String o1, String o2) {
//        return o1.length()-o2.length();
//    }
//}

public class Comparators {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(10);
        list.add(8);

//        list.sort( new SortingIntegerByComparator());
        list.sort((a,b) -> b-a);
        System.out.println(list);

        List<String> words = Arrays.asList("banana","mango","apple");
//        words.sort(new SortingStringByComparator());
        words.sort((a,b)->b.length()-a.length());
        System.out.println(words);

        // using ;amba expression




    }
}
