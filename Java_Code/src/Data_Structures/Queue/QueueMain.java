package Data_Structures.Queue;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class QueueMain {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList();

        // Add
        q.add(5);
        q.add(90);
        q.add(34);
        q.offer(76);
        System.out.println(q);

        //Remove
        System.out.println(q.remove());     // --> When list is empty it'll throw exception
        System.out.println(q.poll());       // --> It'll return Null

        // peek & element
        System.out.println(q.peek());       // --> When list is empty it'll throw exception
        System.out.println(q.element());    // --> It'll return Null

        System.out.println(q);

        MyQueue<Integer> mq = new MyQueue<>();
        mq.enqueue(54);
        mq.enqueue(87);
        mq.enqueue(90);
        mq.enqueue(45);

        System.out.println(mq.dequeue());
        System.out.println(mq.dequeue());
        System.out.println(mq.dequeue());
        System.out.println(mq.dequeue());
        System.out.println(mq.dequeue());

        mq.enqueue(145);
        System.out.println(mq.dequeue());
    }
}
