package Data_Structures.array;

import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows : ");
        int row = sc.nextInt();
        System.out.print("Enter the cols : ");
        int col = sc.nextInt();
        int mat1[][] = new int[row][col];
        int mat2[][] = new int[row][col];
        int matop[][] = new int[row][col];
        System.out.println("Enter the values of Matrix 1 ");
        for (int i = 0;i<row;i++){
                for(int j = 0;j<col;j++){
                    mat1[i][j] = sc.nextInt();
                }
        }
        System.out.println("Enter the values of Matrix 2 ");
        for (int i = 0;i<row;i++){
            for(int j = 0;j<col;j++){
                mat2[i][j] = sc.nextInt();
            }
        }

        for (int i = 0;i<row;i++){
            for(int j = 0;j<col;j++){
                matop[i][j] = mat1[i][j]+mat2[i][j];
            }
        }

        for (int i = 0;i<row;i++){
            for(int j = 0;j<col;j++){
                System.out.print(matop[i][j]+" ");
            }
            System.out.println();
        }

    }
}
