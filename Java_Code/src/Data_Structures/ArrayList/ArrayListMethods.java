package Data_Structures.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods {
    public static void main(String[] args) {
        List<Integer> a1 =new ArrayList();

        // add(element)
        a1.add(1);
        a1.add(1,5);

        // addAll(collection)
        ArrayList<Integer> c = new ArrayList();
        c.add(90);
        c.add(100);

        a1.addAll(c);

        // get(index)
        int a = a1.get(1);

        // set(index, value)
        a1.set(1,5005);

        // remove(index)
        a1.remove(1);

        // removeAll()
        a1.removeAll(c);

        // clear();
        a1.clear();

        //size()
        a1.size();

        //isEmpty()
        a1.isEmpty();

        //toArray()
        a1.addAll(c);

        Integer arr[] = new Integer[a1.size()];
        a1.toArray(arr);
    }
}
