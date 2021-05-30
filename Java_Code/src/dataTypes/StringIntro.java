package dataTypes;

public class StringIntro {
    public static void main(String[] args) {
        String name1 = "Yogesh";
        String name2 = "Yogesh";
        String name3 = new String("Yogesh");
        System.out.println(name1 == name2);   // String Pool Area
        System.out.println(name1 == name3);   // Heap Area

        System.out.println(name2.charAt(0)+""+name1.charAt(1));  // Take a character from String

    }
}
