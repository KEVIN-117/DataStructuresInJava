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
public class Example_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < A.length; i++) {
            A[i] = input.nextInt();
        }
        int mayor = 0;
        int menor = A[A.length-1];
        for (int i = 0; i < A.length; i++) {
            if (A[i] > mayor) {
                mayor = A[i];
            }else if(menor > A[i]){
                menor = A[i];
            }
        }
        System.out.println(mayor);
        System.out.println(menor);
    }
}
