package Data_Structures.Stack;

import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack();

        s.push(12);
        s.push(45);
        s.push(78);

        System.out.println(s.pop());

        System.out.println(s.peek());

        System.out.println(s.pop());
    }
}
