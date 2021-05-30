package OOPs.Inheritance.SingleInheritance;

public class Animal  {
    void eat(){
        System.out.println("Eating");
    }

    public static void main(String[] args) {
        Animal dog = new Animal();
        dog.eat();

        Bird cock = new Bird();
        cock.eat();
    }
}
class Bird extends Animal{

}
