/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea_3;

import java.util.Scanner;

/**
 *
 * @author krodr
 */
public class copyOfExampleMagicSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[][] A = new int[N][N];
        
        int center = N/2;
        int positionColumn = center;
        int positionRow = 0;
        
        A[positionRow][positionColumn] = 1;
        int currentPositionRow = positionRow;
        int currentPositionColumn = positionColumn;
        
        for (int i = 2; i <= (Math.pow(A.length, 2)); i++) {
            positionRow--;
            positionColumn--;
            if (positionRow < 0) {
                positionRow = A.length-1;
            }
            if (positionColumn < 0) {
                positionColumn = A.length-1;
            }
            if (A[positionRow][positionColumn] == 0) {
                A[positionRow][positionColumn] = i;
            }else{
                positionRow = currentPositionRow+1;
                positionColumn = currentPositionColumn;
                A[positionRow][positionColumn] = i;
            }
            currentPositionRow = positionRow;
            currentPositionColumn = positionColumn;
        }
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }
}
