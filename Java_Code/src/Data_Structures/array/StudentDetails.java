package Data_Structures.array;

import java.util.Scanner;

public class StudentDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of students : ");
        int noOfStudents = sc.nextInt();

        String students[] = new String[noOfStudents];
        int marks[] = new int[noOfStudents];

        System.out.println("Enter the details of students");

        for(int i = 0;i<noOfStudents;i++){
            System.out.println("Enter the name of "+i+"th student");
            sc.nextLine();
            students[i] = sc.nextLine();
            System.out.println("Enter the marks of "+i+"th student");
            marks[i] = sc.nextInt();
        }
        for(int i = 0; i<noOfStudents;i++){
            System.out.println(students[i]+"  :  "+marks[i]);
        }
    }
}
