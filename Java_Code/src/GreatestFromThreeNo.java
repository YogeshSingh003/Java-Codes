public class GreatestFromThreeNo {
    public static void main(String[] args) {
        
        int a = 100, b = 40000, c = 60000;
        if (a > b && a > c) {
            System.out.println(a + " is greatest");
        } else if (b > c) {
            System.out.println(b + " is greatest");
        } else {
            System.out.println(c + " is greatest");
        }

        // Using Nested Conditions
        int result = 0;
        if (a > b) {
            if (a > c) {
                result = a;
            } else {
                result = c;
            }
        }
            if (b > c) {
                result = b;
            } else {
                result = c;
            }
            System.out.println("Greatest No is " + result);

            // Using Ternary Operator
        int newResult = 0;
        newResult = a>b?a>c?a:c:b>c?b:c;
        System.out.println(newResult);

    }
}
