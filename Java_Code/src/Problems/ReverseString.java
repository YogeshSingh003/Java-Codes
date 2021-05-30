package Problems;

public class ReverseString {
    public static void main(String[] args) {
        String s = "for";
        char[] str = s.toCharArray();
        for(char c: str){
            System.out.print(c+" ");
        }

        for(int i = str.length;i>str.length/2;i--){
            char k = str[i-1];
            str[i-1] = str[str.length-i];
            str[str.length-i] = k;
        }

        System.out.println();
        for(char c: str){
            System.out.print(c+" ");
        }
    }
}
