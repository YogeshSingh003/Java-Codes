package Problems;

import java.util.*;

public class FindTripletsWithZeroSum

{
    public static void main(String[] args) {
        System.out.println(findTriplets(new int[]{1,2,3,4,-5}, 5));
    }

    public static boolean findTriplets(int arr[] , int n)
    {
        Arrays.sort(arr);

        for(int i = 0; i<n-2; i++){
            if(twoSum(arr, -arr[i], i+1)) {
                return true;
            }
        }
        return false;
    }
    public static boolean twoSum(int a[], int x, int i){
        int j = a.length - 1;
        while(i<j){
            if(a[i] + a[j] > x){
                j--;
            }
            else if(a[i] + a[j] < x){
                i++;
            }
            else{
                return true;
            }
        }
        return false;
    }
}
