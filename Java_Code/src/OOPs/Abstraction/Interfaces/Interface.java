package OOPs.Abstraction.Interfaces;

interface I1 {
    int i = 10;
    void show();
//    default void display(){
//    }
//    static void run(){
//    }
}
interface I2{
    void display();
}
 class Interface implements I1, I2 {
     public void display() {
         System.out.println("2");
     }

     public void show(){
        System.out.println("1");
    }


     public static void main(String[] args) {
         Interface I = new Interface();
         I.show();
         I.display();

     }
}
