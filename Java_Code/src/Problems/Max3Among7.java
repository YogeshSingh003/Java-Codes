package Problems;

import java.util.Scanner;

public class Max3Among7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr1[] = new int[7];
        int max1 = 0;
        int max2 = 0;
        int max3 = 0;
        int temp1= 0;
        int temp2 = 0;
        System.out.println("Enter no for arr[7] : ");
        for(int i = 0; i<7; i++){
            System.out.print("Enter the no : ");
            arr1[i] = sc.nextInt();
        }
        for(int i = 0;i< arr1.length;i++) {
            if (arr1[i] > max3) {
                max3 = arr1[i];
                if (arr1[i] > max2) {
                    temp2 = max2;
                    max2 = arr1[i];
                    max3 = temp2;
                    if (arr1[i] > max1) {
                        temp1 = max1;
                        max1 = arr1[i];
                        max2 = temp1;
                    }
                }
            }
        }
        System.out.println(max1+" "+max2+" "+max3);
    }
}
