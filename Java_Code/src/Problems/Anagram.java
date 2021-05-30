package Problems;

public class Anagram {
    public static void main(String[] args) {
        String a = "12@3 #";
        String b = "123@#7";
        boolean isAnagram = true;
//        for(int i = 0;i<a.length();i++){
//            char c = a.charAt(i);
//            isAnagram = false;
//            for(int j = 0;j<b.length();j++){
//                if(b.charAt(j) == c){
//                    isAnagram = true;
//                    break;
//                }
//            }
//            if(!isAnagram){
//                break;
//            }
//        }
        int al[] = new int[256];
//        int bl[] = new int[256];

        for(char c: a.toCharArray()){
            int index = (int) c;
            al[index]++;
        }

       char[] gfg = a.toCharArray();
        for(int i = 0;i<gfg.length;i++){
            System.out.println(gfg[i]);
        }

        for(char c: b.toCharArray()){
            int index = (int) c;
            al[index]--;
        }

        for(int i = 0;i<256;i++) {
            if (al[i] != 0) {
                isAnagram = false;
                break;
            }
        }

        if(isAnagram)
            System.out.println("Yes it is anagram");
        else
            System.out.println("Not anagram");


    }

}
