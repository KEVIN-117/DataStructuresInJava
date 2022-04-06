/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sortingAlgorithms;

/**
 *
 * @author krodr
 */
public class ExampleOfSort {
    public static void main(String[] args) {
        int[] A = {56, 34, 10, 77, 51, 93, 30, 5, 52, 4};
        int counter = 0;
        for (int i = 0; i < A.length-1; i++) {
            for (int j = 0; j < A.length-1; j++) {
                if (A[j] > A[j+1]) {
                    int aux = A[j];
                    A[j] = A[j+1];
                    A[j+1] = aux;
                }
                counter++;
            }
        }
        System.out.println(counter);
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
    }
}
