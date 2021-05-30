package OOPs.Polymorphism;

public class MethodOverloading {
    void test(){
        System.out.println("This is test");
    }
    void test(String name,int age){
        System.out.println("This is test "+name+" "+age);
    }
    void test(int age,String name){
        System.out.println("Age : "+age+" Name : "+name);
    }

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        obj.test();
        obj.test(25,"Ram");
        obj.test("Laxman",30);
    }
}
