package Algorithms;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {2,1,4,13,40};
        int len = arr.length;

        for(int i = 0; i<len-1; i++){
            boolean sort = true;
            for(int j = 0; j<len-1-i; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    sort = false;
                }
            }
            if(sort) break;
        }
        for(int item: arr){
            System.out.print(item+" ");
        }
    }
}
