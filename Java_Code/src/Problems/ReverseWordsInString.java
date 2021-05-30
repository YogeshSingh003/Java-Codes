package Problems;

public class ReverseWordsInString {
    public static void main(String[] args) {
        System.out.println(reverseWords("  Bob    Loves  Alice   "));
    }

    public static String reverseWords(String s) {
        StringBuilder str = new StringBuilder(s.length());
        
        int i = s.length() - 1;
        while (i >= 0) {
            while (i >= 0 && s.charAt(i) == ' ')
                i--;
            int j = i;
            while(i >= 0 && s.charAt(i) != ' ')
                i--;
            if(str.isEmpty())
                str = str.append(s.substring(i+1,j+1));
            else
                str = str.append(' '+ s.substring(i+1,j+1));
        }
        String s1 = str.toString();
        return s1;
    }
}

//class Solution {
//    public String reverseWords(String s) {
//        StringBuffer sb = new StringBuffer();
//
//        int i = s.length() - 1;
//
//        while (i >= 0) {
//            if (s.charAt(i) == ' ') {
//                i--;
//            } else {
//                int j = i;
//                while (i >= 0 && s.charAt(i) != ' ') {
//                    i--;
//                }
//                if (sb.length() > 0) {
//                    sb.append(' ');
//                }
//                for (int k = i + 1; k <= j; k++) {
//                    sb.append(s.charAt(k));
//                }
//            }
//        }
//
//        return sb.toString();
//    }
//}