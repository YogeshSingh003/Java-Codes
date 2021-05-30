package Rough;

public class ll {
   Node head;

   public void add(int data){
       Node toAdd = new Node(data);

       if(head == null) {
           head = toAdd;
            return;
       }
       Node temp = head;
       while (temp.next != null){
           temp = temp.next;
       }
       temp.next = toAdd;
   }

   public void print(){
       Node temp = head;
       while(temp != null){
           System.out.println(temp.data);
           temp = temp.next;
       }
   }

    public static void main(String[] args) {
            ll l1 = new ll();
            l1.add(5);
            l1.add(8);
            l1.add(59);
            l1.add(81);
            l1.print();
        }
    }

