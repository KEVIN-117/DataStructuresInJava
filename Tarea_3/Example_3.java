/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea_3;
import java.util.Scanner;
/**
 *
 * @author krodr
 * Realice un programa que permita insertar números en una matriz de tamaño M X N, posteriormente 
 * muestre toda la fila donde se encuentra el número más grande de la matriz
    Ejemplo: 
    Entrada             Salida
    3 4                 6 7 4 3
    4 6 2 2
    6 7 4 3
    3 6 3 1
 */
public class Example_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int M = input.nextInt();
        int N = input.nextInt();
        int[][] A = new int[M][N];
        
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                A[i][j] = input.nextInt();
            }
        }
        
        int bigNumberRow = 0;
        int indexRow = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                if (A[i][j] > bigNumberRow) {
                    bigNumberRow = A[i][j];
                    indexRow = i;
                }
            }
        }
        
        for (int i = 0; i < N; i++) {
            System.out.print(A[indexRow][i] + " ");
        }
    }
}
