package OOPs.Polymorphism;

public class MethodOverriding{
    public static void main(String[] args) {
        MethodOverriding test1 = new MethodOverriding();
        one test2 = new one();
        test1.main();
        test2.main();

    }
    void main() {
        System.out.println("1");
    }
}
class one extends MethodOverriding{
    void main(){
        System.out.println("2");
    }
}
