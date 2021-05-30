package Problems;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrLength = sc.nextInt();
        int[] arr = new int[arrLength];
        for(int i = 0; i < arrLength; i++){
            arr[i] = sc.nextInt();
        }
        for(int e:arr){
            System.out.print(e+" ");
        }
        for(int i = 0; i < arrLength/2; i++){
            int temp = arr[i];
            arr[i] = arr[arrLength-i-1];
            arr[arrLength-i-1] = temp;
        }
        for(int e:arr){
            System.out.print(e+" ");
        }
    }

}
