package Data_Structures.array;

import java.util.Scanner;

public class StudentsAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of students : ");
        int n = sc.nextInt();

        int marks[] = new int[n];
        float average = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter marks for " + i + "th student : ");
            marks[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(marks[i]+"  ");

            average = average+marks[i];
        }

        average = average/n;
        System.out.println(average);
    }
}
