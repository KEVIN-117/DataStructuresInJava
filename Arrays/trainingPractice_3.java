/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

import java.util.Scanner;

/**
 *
 * @author krodr
 * Realice un algoritmo para insertar N números en un vector, 
 * posteriormente visualice todos los números que están entre 
 * dos números pares.
 */
public class trainingPractice_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int A[] = new int[N];
        for (int i = 0; i < A.length; i++) {
            A[i] = input.nextInt();
        }
        
        try {
            for (int i = 0; i < A.length; i++) {
                int counter = i+2;
                if(A[i] % 2 == 0 && A[counter] % 2 == 0){
                    System.out.print(A[i+1] + " ");
                }
            }
        } catch (Exception e) {
           System.out.println("");
        }
        
    }
}
