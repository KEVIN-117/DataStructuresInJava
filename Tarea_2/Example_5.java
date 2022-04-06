/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea_2;
import java.util.Scanner;
/**
 * @author krodr
 * 5. Realice un programa que permita insertar N números en un vector, 
 * posteriormente visualice todoslos números que están después de número más grande
 * Ejemplo: 
 *      Entrada                     Salida
      7                             5 2 10
      4 6 3 18 5 2 10
 */
public class Example_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[] A = new int[N];
        int i;
        for ( i= 0; i < A.length; i++) {
            A[i] = input.nextInt();
        }
        
        int mayor = 0;
        int index = 0;
        for (i = 0; i < A.length; i++) {
            if (A[i] > mayor) {
                mayor = A[i];
                index = i;
            }
        }
        for (i = index+1; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
    }
}
