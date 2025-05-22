package Java_CollectionFramework.collectionFramework;

import java.util.Arrays;

public class ArrayClass {

    public static void main(String[] args) {

        Integer[] arr = {1,4,57,6,2};

        Arrays.sort(arr);
        Arrays.fill(arr,12);

        for (Integer i : arr)
        {
            System.out.println(i);
        }
    }
}
