package Data_Structures.Stack;

import java.util.Stack;

public class StackMain {
    public static void main(String[] args) throws Exception {
        Stack<Integer> s = new Stack();

        s.push(12);
        s.push(45);
        s.push(78);
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s);

        
        // Using Stack created by LinkedList
        MyStack<Integer> s1 = new MyStack();
        s1.push(5);
        s1.push(8);
        System.out.println(s1.pop());
        s1.push(90);
        System.out.println(s1.peek());
        s1.display();
    }
}
