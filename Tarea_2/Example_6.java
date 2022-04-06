/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea_2;
import java.util.Scanner;
/**
 * @author krodr
 * 6. Realice un programa que permita insertar N números en un vector, 
 * posteriormente visualice el número más grande, y además cuántas 
 * veces se repite ese número.
 *      Ejemplo: 
 *      Entrada                                 Salida
        7                                       el número más grande es: 8
        5 6 8 3 5 8 1                           se repite: 2
 */
public class Example_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < A.length; i++) {
            A[i] = input.nextInt();
        }
        int mayor = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] > mayor) {
                mayor = A[i];
            }
        }
        int counter = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == mayor) {
                counter++;
            }
        }
        System.out.println("El numero mayor es: " + mayor +"\nse repite: " + counter);
    }
}
