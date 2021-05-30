package patterns;

import java.util.Scanner;

public class TrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no : ");
        int n = sc.nextInt();

        for(int i = 1; i<=n;i++){
            for(int j =1;j<=n;j++){
                if(j<i)
                    System.out.print("  ");
                else
                    System.out.print("* ");
            }
            System.out.println();
        }

        for(int  i = 1;i<=n;i++){
            for(int j = 1;j<=i-1;j++){
                System.out.print("  ");
            }
            for (int j = 1;j<=n-i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}