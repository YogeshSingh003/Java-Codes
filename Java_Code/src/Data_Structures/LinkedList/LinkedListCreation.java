package Data_Structures.LinkedList;

public class LinkedListCreation<E> {
    Node head;

    public void add(E data){
        Node toAdd = new Node(data);

        if(isEmpty()){
            head = toAdd;
            return;
        }

        Node temp = head;
        while(temp.next != null ){
            temp = temp.next;
        }
        temp.next = toAdd;
    }

    void print(){
        Node temp = head;
        while(temp != null ){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public boolean isEmpty(){
        return head == null;
    }

    public  E removeLast() throws Exception{
        Node<E> temp = head;

        if(temp == null){
            throw new Exception("Cannot remove last element from empty stack");
        }

        if(temp.next == null){
            Node<E> toRemove = head;
            head = null;
            return toRemove.data;
        }
        while(temp.next.next != null ){
            System.out.println(temp.data);
            temp = temp.next;
        }
        Node<E> toRemove = temp.next;
        temp.next = null;
        return toRemove.data;
    }
    static class Node<E>{
        E data;
        Node next;

        public Node(E data){
            this.data = data;
            next = null;
        }
    }
}