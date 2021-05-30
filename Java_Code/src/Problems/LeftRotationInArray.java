package Problems;

import java.util.*;

public class LeftRotationInArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int arrLength = sc.nextInt();
        int rotation = sc.nextInt();
        int[] arr = new int[arrLength];
        for(int i = 0; i < arrLength; i++){
            arr[i] = sc.nextInt();
        }

        for(int e: arr){
            System.out.print(e+" ");
        }
        System.out.println("");

        for(int i = 0; i<rotation; i++){
            int temp = arr[0];
            for(int j = 0; j<arrLength-1; j++){
                arr[j] = arr[j+1];
            }
            arr[arrLength-1] = temp;
        }

        for(int e: arr){
            System.out.print(e+" ");
        }
    }
}
