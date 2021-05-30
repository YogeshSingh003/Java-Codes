public class TypeCasting {
    public static void main(String[] args) {
        //Automatic TypeCasting
        byte x = 4;
        short a = x ;
        int y = a;
        long g = y;
        float f = g;
        double d = 7;
        System.out.println(x+" "+a+" "+y+" "+g+" "+f+" "+d);

        //Manual TypeCasting
        g = (int) d;
        System.out.println(g);
    }
}
