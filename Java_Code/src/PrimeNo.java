import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the no : ");
//        int n = sc.nextInt();
        int count = 0;

        for (int j = 2; j <= 100; j++) {
            boolean flag = true;
            for (int i = 2; i * i <= j; i++) {
                if (j % i == 0) {

                    flag = false;
                    break;
                }
            }
            if (j < 2)
                flag = false;
            if(flag == true) {
                System.out.println(count+" "+j + " is " + flag);
                count++;
            }

        }
        System.out.println(count);
    }
}