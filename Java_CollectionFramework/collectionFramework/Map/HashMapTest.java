package Java_CollectionFramework.collectionFramework.Map;


import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

    public static  void main(String[] args) {

        //map does not extends collections
        //hashmap is implementation
        //unordered
        // onlY null value in hashmap
        //not synchronised

        // o(1)

        HashMap<Integer,String>  map = new HashMap<>();
        map.put(1,"Vishal");
        map.put(3,"Ayush");
        map.put(5,"Divya");
        map.put(4,"isha");
        map.put(2,"aditya");
//        map.putIfAbsent(3,"varun");

//        System.out.println(map);
//        System.out.println(map.get(3));

//        for (Integer i : map.keySet()) {
//
//            System.out.println(map.get(i).toUpperCase());
//
//        }

        for(Map.Entry<Integer,String> e :map.entrySet())
        {
            System.out.println(e);
        }
//
//        System.out.println(map.containsKey(2));

//        String remove = map.remove(3);

        //internal structure of hashmap
        //key
        //value
        //used array as bucket
        //hash function : algo that take input or key and return a fixed sized string of bytes
        //typically a numerical value known as hash code( 32bit - 64bit)

        //how data is stored in hashmap
        // 1. hashing the key
        // 2. calculate the index int index = hashcode % arraysize;
        //3. storing in bucket

        // after collision linked list --> red black tree



    }
}
