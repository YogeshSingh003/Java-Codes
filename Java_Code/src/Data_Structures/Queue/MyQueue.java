package Data_Structures.Queue;
import Data_Structures.LinkedList.MyLinkedList.*;

public class MyQueue<E> {
    private Node<E> head,tail;

    public void enqueue(E e){
        Node<E> toAdd = new Node<>(e);

        if(head == null){
            head = tail = toAdd;
            return;
        }

        tail.next = toAdd;
        tail = tail.next;
    }

    public E dequeue(){
        if(head == null){
            return null;
        }

        Node<E> temp = head;
        head = head.next;

        if(head == null){
            tail =  null;
        }

        return (E) temp.data;
    }
}
