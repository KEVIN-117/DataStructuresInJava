/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sortingAlgorithms;

/**
 *
 * @author krodr
 */
public class ExampleSelectionSort {
    public static void main(String[] args) {
        System.out.println("SELECTION SORT");
        int[] A = {3,10,1,8,15,5,12,6,5,4};
        //int A[] = {56, 34, 10, 77, 51, 93, 30, 5, 52, 4};
        for (int i = 0; i < A.length; i++) {
            int menor = A[i];
            int index = i;
            for (int j = i ; j < A.length; j++) {
                if (A[j] < menor) {
                    menor = A[j];
                    index = j;
                }
            }
            int aux = A[i];
            A[i] = menor;
            A[index] = aux;
        }
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
    }
}