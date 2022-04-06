/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

import java.util.Scanner;

/**
 *
 * @author krodr
 * Realice un programa para insertar N números en un vector, 
 * posteriormente muestre el número par más grande
 */
public class trainingPractice_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < A.length; i++) {
            A[i] = input.nextInt();
        }
        int evenNumberBig = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                if (A[i] > evenNumberBig) {
                    evenNumberBig = A[i];
                }
            }
        }
        System.out.println(evenNumberBig);
    }
}
