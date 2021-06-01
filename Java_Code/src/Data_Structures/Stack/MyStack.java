package Data_Structures.Stack;

import Data_Structures.LinkedList.MyLinkedList;

public class MyStack<E> {
    private MyLinkedList<E> ll = new MyLinkedList();

    public void push(E e){
        ll.add(e);
    }

    public E pop() throws Exception {
        if(ll.isEmpty()){
            throw new Exception("Popping from empty stack");
        }

    return ll.deleteLast();
    }

    void display(){
        ll.print();
    }

    public E peek() throws Exception {
        if(ll.isEmpty()){
            throw new Exception("Peeking from empty stack");
        }
        return ll.getLast();
    }

}
