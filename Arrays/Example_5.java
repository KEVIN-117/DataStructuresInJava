/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

import java.util.Scanner;

/**
 *
 * @author krodr
 */
public class Example_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] A = new int[5];
        int i, j;
        for ( i= 0; i < A.length; i++) {
            A[i] = input.nextInt();
        }
        
        for (i = 0; i < A.length; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print(A[j] + " ");
            }
            System.out.println();
        }
    }
}
