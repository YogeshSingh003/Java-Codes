import java.util.Scanner;

public class Rating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rating.....");
        byte n = sc.nextByte();

        switch (n){
            case 1:
            case 2:
                System.out.println("Bad");
                break;
            case 3:
                System.out.println("Average");
                break;
            case 4:
            case 5:
                System.out.println("Good");
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
}
