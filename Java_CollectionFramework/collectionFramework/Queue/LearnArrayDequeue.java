package Java_CollectionFramework.collectionFramework.Queue;

import java.util.ArrayDeque;

public class LearnArrayDequeue {
    public static void main(String[] args) {

        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.offer(23);
        System.out.println(adq);
        adq.offerFirst(12);
        System.out.println(adq);
        adq.offerLast(234);
        System.out.println(adq);
        adq.offer(21);

        System.out.println(adq);

        System.out.println(adq.peek());
        System.out.println(adq.peekLast());

        System.out.println(adq);

    }
}
