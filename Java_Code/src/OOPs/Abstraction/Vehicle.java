package OOPs.Abstraction;

abstract class Vehicle {
    abstract void start();
}
class Car extends Vehicle{
    void start(){
        System.out.println("Start with key");
    }

    public static void main(String[] args) {
        Car c = new Car();
        c.start();
        Scooter s = new Scooter();
        s.start();
    }
}
class Scooter extends Vehicle{
    void start(){
        System.out.println("Starts with kick");
    }
}
