package Data_Structures.Stack;

<<<<<<< HEAD
import Data_Structures.LinkedList.MyLinkedList;

public class StackUsingLinkedList<E> {
    private MyLinkedList<E> ll = new MyLinkedList();
=======
import Data_Structures.LinkedList.LinkedListCreation;

public class StackUsingLinkedList<E> {
    private LinkedListCreation<E> ll = new LinkedListCreation();
>>>>>>> 21ec0459e4830a114090a1b978f2d352fc940145

    void push(E e){
        ll.add(e);
    }

    E pop() throws Exception {
        if(ll.isEmpty()){
            throw new Exception("Popping from empty stack");
        }

    return ll.deleteLast();
    }

    void display(){
        ll.print();
    }

    E peek() throws Exception {
        if(ll.isEmpty()){
            throw new Exception("Peeking from empty stack");
        }
        return ll.getLast();
    }
public static void main(String[] args) throws Exception {
    StackUsingLinkedList<Integer> s1 = new StackUsingLinkedList();
    s1.push(5);
    s1.push(8);
    System.out.println(s1.pop());
    s1.push(90);
    System.out.println(s1.peek());
    s1.display();
}
}
