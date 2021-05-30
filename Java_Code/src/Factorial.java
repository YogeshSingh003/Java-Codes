public class Factorial {
    public static void main(String[] args) {
        byte n = 7;
        int factorial = 1;
        for(int i = n; i > 0;i--){
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }
}
