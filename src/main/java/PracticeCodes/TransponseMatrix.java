package PracticeCodes;

import java.util.Scanner;

/*
*Write a program for transpose of a m*n matrix
 * example:
 * input:size of an array from user 3*3;
 *    1 2 3
 *    4 5 6
 *    7 8 9
 * output:
 *    1 4 7
 *    2 5 8
 *    3 6 9
 * */
public class TransponseMatrix {
    public static void main(String[] args) {
        enterInputDetails();

    }

    private static void transposeMatrix(int[][] ints, int n, int m) {
        int[][] resultant=new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                resultant[i][j]=ints[j][i];
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(resultant[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static void enterInputDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the order of matrix n: ");
        int n = scanner.nextInt();
        System.out.println("Enter the order of matrix m: ");
        int m = scanner.nextInt();
        int[][] arr= new int[n][m];
        System.out.println("Enter the elements to matrix");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[j][i]);
            }
            System.out.println();
        }
        //transposeMatrix(arr,n,m);
    }
}
