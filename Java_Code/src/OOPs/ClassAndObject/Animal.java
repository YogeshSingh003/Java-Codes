package OOPs.ClassAndObject;

 class Animal {
     String color;

    public static void main(String[] args) {
        Animal dog = new Animal();
        dog.eat();
        dog.color = "White";
        System.out.println(dog.color);
        Bird cock = new Bird();
        Bird sparrow = new Bird();

        sparrow.eggs(2);
        sparrow.egg = 3;
        sparrow.sex = "Female";
        sparrow.details();

        cock.fly();
        cock.sex = "Male";
        cock.eggs(4);
        cock.details();

        dog.color = "red";
        System.out.println(dog.color);
    }
     void eat(){
        System.out.println("Eating");
    }
}
class Bird {
String sex;
int egg = 8;
    void fly() {
        System.out.println("Bird is flying");
    }
    void eggs(int a){
        egg = a;
    }
    void details(){
        System.out.println(egg);
        System.out.println(sex);
    }
}