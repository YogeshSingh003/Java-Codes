package OOPs.Inheritance.MultiLevelInheritance;

public class Engineer {
    void work(){
        System.out.println("I'm an Engineer and i can do what i want");
    }

    public static void main(String[] args) {
        Engineer ramdev = new Engineer();
        ramdev.work();

        CSEngineer nandini = new CSEngineer();
        nandini.coding();
        nandini.work();

        ECEngineer yogesh = new ECEngineer();
        yogesh.electronic();
        yogesh.coding();
        yogesh.work();
    }
}
class CSEngineer extends Engineer
{
    void coding(){
        System.out.println("I can do coding but not physical work");
    }
}
class ECEngineer extends CSEngineer
{
    void electronic(){
        System.out.println("I can repair electronic devices and i can do coding too..");
    }
}