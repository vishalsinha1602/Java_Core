package Java_CollectionFramework.collectionFramework.Queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueLearn {
    public static void main(String[] args) {

//        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // by default it implement minheap

        // maxheap convert using comparator

        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.offer(20); //add
        pq.offer(87);
        pq.offer(54);
        pq.offer(36);

        System.out.println(pq);

        pq.poll();//remove
        System.out.println(pq);

        System.out.println(pq.peek()); // ready to out




    }
}
