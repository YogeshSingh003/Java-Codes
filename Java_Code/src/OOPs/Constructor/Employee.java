package OOPs.Constructor;

public class Employee {
    String name;
    int id;
    Employee(String name, int id){
        this.name = name;
        this.id = id;
    }
    void details(){
        System.out.println("Name : "+name+"   ID : "+id);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Ramesh", 1001);
        Employee e2 = new Employee("Ram Kumar", 5009);
        e1.details();
        e2.details();
    }
}
