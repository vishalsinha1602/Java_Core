package Java_CollectionFramework.collectionFramework.Map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {
    public static void main(String[] args) {
        Map<Integer,String> map = new TreeMap<>();

        // put key in binary search tree , so that key will be in sorted order.

        map.put(1,"vishal");
        map.put(4,"roushan");
        map.put(2,"aditya");
        map.put(3,"suraj");

        System.out.println(map);

    }
}
