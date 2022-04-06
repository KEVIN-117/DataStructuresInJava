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
public class Example_1 {
    public static void main(String[] args) {
        int[][] A = new int[4][3];
        Scanner input = new Scanner(System.in);
        int i,j;
        for (i = 0; i < A.length; i++) {
            for (j = 0; j < A[i].length; j++) {
                A[i][j] = input.nextInt();
            }
        }
        System.out.println();
        for (i = 0; i < A.length; i++) {
            for (j = 0; j < A[i].length; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }
}
