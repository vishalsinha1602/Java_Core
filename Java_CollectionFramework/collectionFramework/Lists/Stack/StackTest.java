package Java_CollectionFramework.collectionFramework.Lists.Stack;

import java.util.LinkedList;
import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack<Integer> stack =new Stack<>();
        // it extends vector  // synchronised
        // LIFO behaviour
        // constructor
        // method

        stack.push(23);
        stack.push(21);
        stack.add(231); // vector -> extends
        stack.pop();
        stack.empty();
      System.out.println(stack.search(54)); // // 1 based index

        //LINKED LIST AS STACK
//        LinkedList<Integer> linkedList = new LinkedList<>();
//        linkedList.addLast(23);
//        linkedList.addLast(22);
//        linkedList.addLast(23);

    }
}












