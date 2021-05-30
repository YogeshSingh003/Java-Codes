package Problems;

import java.util.Scanner;

public class Max2Among5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr1[] = new int[5];
        int max1 = 0;
        int max2 = 0;
        int temp= 0;
        System.out.println("Enter no for arr[5] : ");
        for(int i = 0; i<5; i++){
            System.out.print("Enter the no : ");
            arr1[i] = sc.nextInt();
        }
        for(int i = 0;i< arr1.length;i++){
            if(arr1[i]>max2) {
                max2 = arr1[i];
                if (arr1[i] > max1) {
                    temp = max1;
                    max1 = arr1[i];
                    max2 = temp;
                }
            }
        }
        System.out.println(max1+" "+max2);
    }
}
