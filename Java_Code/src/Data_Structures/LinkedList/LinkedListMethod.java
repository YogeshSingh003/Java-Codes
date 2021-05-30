package Data_Structures.LinkedList;

import java.util.*;

public class LinkedListMethod {
    public static void main(String[] args) {
        List<Integer> l1 =new LinkedList<>();

        // add(element)
        l1.add(1);
        l1.add(1,5);

        // addAll(collection)
        List<Integer> c = new LinkedList<>();
        c.add(90);
        c.add(100);

        l1.addAll(c);

        // get(index)
        int a = l1.get(1);

        // set(index, value)
        l1.set(1,5005);

        // remove(index)
        l1.remove(1);

        // removeAll()
        l1.removeAll(c);

        // clear();
        l1.clear();

        //size()
        l1.size();

        //isEmpty()
        l1.isEmpty();

        //toArray()
        l1.addAll(c);

        Integer arr[] = new Integer[l1.size()];
        l1.toArray(arr);
    }
}
