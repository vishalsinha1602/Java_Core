package Java_CollectionFramework.collectionFramework.Lists.LinkedLists;

import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(23);
        linkedList.add(34);
        linkedList.add(2);

//        System.out.println(linkedList);

        linkedList.addFirst(1);
        linkedList.addLast(64);
        linkedList.remove(3);
        linkedList.getLast();
        linkedList.getFirst();

        linkedList.removeIf(x->x%2==0);

        for (int i : linkedList)
        {
            System.out.println(i);
        }
    }
}
