package Java_CollectionFramework.collectionFramework.Lists.ArrayLists;

import java.util.*;



class StringLengthComparator implements  Comparator<String>{
    @Override
    public int compare(String s1 , String s2)
    {

        return 0;

    }

}

public class ArrayLists {
    public static void main(String[] args) {

//        int[] arr = new int (10);

        ArrayList<Integer> list = new ArrayList<>();
        // size=0; capacity = 10;
        // increase capacity by 1.5 time of original
//      Java_CollectionFramework.collectionFramework.List<Integer> list = new Java_CollectionFramework.collectionFramework.List.ArrayList<>();

//        Java_CollectionFramework.collectionFramework.List<String> list = new Arrays.asList("monday");

//        list to array
//        Object[] array = list.toArray();

        list.add(5);
        list.add(1);
//        for (int i : list)
//        {
//            System.out.println(i);
//        }

//        System.out.println(list.contains(24));
//        System.out.println(list.size());
        list.add(1,2);

        // sorting list
//         Collections.sort(list);

        // sorting using comparator

//        list.sort();




        //COMPARATOR
//        Java_CollectionFramework.collectionFramework.List<String> words = Arrays.asList("banna","apple","mango");
//        words.sort(new StringLengthComparator());
//        System.out.println(words);





    }
}
