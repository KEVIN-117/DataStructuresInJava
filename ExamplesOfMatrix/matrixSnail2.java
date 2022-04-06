/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExamplesOfMatrix;

import java.util.Scanner;

/**
 *
 * @author krodr
 */
public class matrixSnail2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //int M = input.nextInt();
        int N = input.nextInt();
        
        int[][] A = new int[N][N];
        int number = 1;
        int row = 0;
        int column = 0;
        
        for (int i = 0; i <= N/2; i++) {
            if (i == N/2) {
                number--;
            }   
            for (int j = column; j < N-column; j++) {
                A[row][j] = number;
                number++;
            }
            for (int j = row+1 ; j < N-row-1; j++) {
                A[j][N-column-1] = number;
                number++;
            }
            for (int j = N-column-1; j >= column; j--) {
                A[N-column-1][j] = number;
                number++;
            }
            for (int j = N-row-2; j > row; j--) {
                A[j][column] = number;
                number++;
            }
            row++;
            column++;
        }
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
        /*for (int i = 10; i >= 0; i--) {
            System.out.print(i + " ");
        }*/
    }
}
