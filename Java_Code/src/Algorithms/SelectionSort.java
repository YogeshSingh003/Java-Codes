package Algorithms;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {5,2,-1,6,3};
        int len = arr.length;

        for(int i = 0;i<len-1;i++){
            int minInd = i;
            for(int j = i;j<len;j++){
                if(arr[j]<arr[minInd])
                    minInd = j;
            }
            int temp = arr[i];
            arr[i] = arr[minInd];
            arr[minInd] = temp;
        }
        for(int e: arr){
            System.out.print(e+" ");
        }
    }
}
