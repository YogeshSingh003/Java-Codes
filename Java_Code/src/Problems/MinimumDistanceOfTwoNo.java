package Problems;

import java.util.Scanner;

public class MinimumDistanceOfTwoNo {
    public static void main(String[] args) {
        int arr[] = {32,3,6,9,21,67};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first no : ");
        int x = sc.nextInt();
        System.out.print("Enter the second No : ");
        int y = sc.nextInt();

        boolean firstBool = true;
        boolean secondBool = true;
        int output;
        int firstNo = 0,secondNo = 0;
        int len = arr.length;
        for(int i = 0; i<len; i++){
            if(arr[i] == x){
                firstNo = i;
                firstBool = false;
                break;
            }
        }
        for(int i = 0; i<len; i++){
            if(arr[i] == y){
                secondNo = i;
                secondBool = false;
                break;
            }
        }
        if(firstBool == true || secondBool == true) {
            System.out.println("No is not in the Data_Structures.array");
        }
        else if (firstNo>secondNo) {
            output = firstNo - secondNo;
            System.out.println("Difference between no is " + output);
        }
        else {
            output = secondNo - firstNo;
            System.out.println("Difference between no is "+output);
        }
    }
}

