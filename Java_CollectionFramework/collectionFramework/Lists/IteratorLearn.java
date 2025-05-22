package Java_CollectionFramework.collectionFramework.Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class IteratorLearn {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        Iterator<String> it = names.iterator();

        while (it.hasNext()) {
            String name = it.next();
            System.out.println(name);
        }
    }
}
