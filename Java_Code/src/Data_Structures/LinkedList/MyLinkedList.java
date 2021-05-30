package Data_Structures.LinkedList;

import java.util.*;

public class MyLinkedList {
    public static void main(String[] args) {
        // Without Generics
        List l1 = new LinkedList();
        l1.add(3);
        l1.add("Krishna");
        l1.add(true);
        l1.add(6.87);
        l1.add(4);
        System.out.println(l1);

        // With Generics
        List<String> l2 = new LinkedList();
        l2.add("Ram"+1);
        l2.add("Shyam");
        System.out.println(l2);

        // generics class object
        Pair<Integer,String> p1 = new Pair(9, "Tam");
        p1.description();

        // Using LinkedList Created by me
        LinkedListCreation<String> ll = new LinkedListCreation();
        ll.add("Ram"+1);
        ll.print();
    }
}

// Generics Class
class Pair<A,B>{
    A a;
    B b;
    public Pair(A a,B b){
        this.a = a;
        this.b = b;
    }
     void description(){
         System.out.println(a+" "+b);
     }
}