package operators;

public class BitwiseOperators {
    public static void main(String[] args) {
        int a = 6;   // 4  ->  100
        int b = 5;   // 6  ->  101
        System.out.println(a&b);
        System.out.println(a|b);
        System.out.println(a^b);
        int c = 25;  // 25 ->  110010
        System.out.println(c<<1);
        System.out.println(c>>1);
    }
}
