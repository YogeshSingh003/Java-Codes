package Data_Structures.ArrayList;
import java.util.*;
public class ArrayListMain {
    public static void main(String[] args) {

        // Without generics
        ArrayList a1 = new ArrayList();
        a1.add("Ram");
        a1.add(3);
        a1.add(3.6);
        System.out.println(a1);

        // With generics
        ArrayList<Integer> a2 = new ArrayList<>();
        a2.add(3);
        a2.add(5);
        System.out.println(a2);

        // Generics class object
        Pair<String,Integer> p1 = new Pair("Ram",45);
        p1.getDescription();
    }
}

// Generics class
class Pair<X,Y>{
    X x;
    Y y;
    public Pair(X x, Y y){
        this.x = x;
        this.y = y;
    }
    void getDescription(){
        System.out.println(x+" "+y);
    }
}