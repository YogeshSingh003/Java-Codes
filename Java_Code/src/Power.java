import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no : ");
        int a = sc.nextInt();
        System.out.print("Enter the power : ");
        int b = sc.nextInt();
        int result = 1;

        for (int i = 0;i<b;i++){
            result = result*a;
        }
        System.out.println(result);
    }
}
