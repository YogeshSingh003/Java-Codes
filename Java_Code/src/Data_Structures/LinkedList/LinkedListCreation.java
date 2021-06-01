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

    public void print(){
        Node temp = head;
        while(temp != null ){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public boolean isEmpty(){
        return head == null;
    }

    void insertAtStart(E data){
        Node toInsert = new Node(data);
        toInsert.next = null;
        toInsert.next = head;
        head = toInsert;
    }


    void insertAtIndex(int index,E data){
        Node insertAtIndex = new Node(data);
//        insertAtIndex.next = null;

        if(index == 0){
//            insertAtStart(data);
            insertAtIndex.next = head;
            head = insertAtIndex;
            return;
        }

        Node temp = head;
        for(int i = 0; i < index-1; i++){
            temp = temp.next;
        }
        insertAtIndex.next = temp.next;
        temp.next = insertAtIndex;
    }

    public E deleteLast() throws Exception{
        Node<E> temp = head;
        if(head == null){
            throw new Exception("Can not remove last element from an empty list");
        }
        if(temp.next == null){
            Node<E> toRemove = head;
            head = null;
            return toRemove.data;
        }
        while (temp.next.next != null){
            temp = temp.next;
        }
        Node<E> toRemove = temp.next;
        temp.next = null;
        return toRemove.data;
    }

    public E getLast() throws Exception{
        Node<E> temp = head;
        if(head == null){
            throw new Exception("Can not peek element from an empty list");
        }

        while (temp.next != null){
            temp = temp.next;
        }

        return temp.data;
    }

    void delete(int index){

        if(index == 0){
            head = head.next;
            return;
        }

        Node temp = head;
        for(int i = 0; i < index-1; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
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
