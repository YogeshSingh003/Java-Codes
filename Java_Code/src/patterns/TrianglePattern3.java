package patterns;

import java.util.Scanner;

public class TrianglePattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no : ");
        int n = sc.nextInt();

        for(int i = n;i >= 0;i--){
            for(int j = 0;j <= i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
