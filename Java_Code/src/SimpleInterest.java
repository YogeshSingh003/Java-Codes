import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int principal = a.nextInt();
        float rate = a.nextFloat();
        int time = a.nextInt();

        float simpleInterest = principal * rate * time/100;
        System.out.println("Simple Interest is "+simpleInterest);

    }
}
