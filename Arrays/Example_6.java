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
public class Example_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[] A = new int[N];
        int i, j;
        for ( i = 0; i < A.length; i++) {
            A[i] = input.nextInt();
        }
        for (i = 0; i < A.length; i++) {
            int counter = 0;
            for (j = 0; j < A.length; j++) {
                if (A[i] == A[j]) {
                    counter++;
                }
            }
            if (counter == 1) {
                System.out.print(A[i] + " ");
            }
            
        }
    }
}
