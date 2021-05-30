package Problems;

public class SortedOrNot {
    public static void main(String[] args) {
        int[] arr = {1,2,3,40,5};
        int len = arr.length;
        boolean sort = true;
        for(int i = 0; i<len-1; i++){
//            if (i<len-1) {
                if (arr[i] > arr[i + 1]) {
                    sort = false;
                    break;
                }
//            }
        }
        if(sort)
            System.out.println("Sorted");
        else
            System.out.println("Not sorted");
    }
}
