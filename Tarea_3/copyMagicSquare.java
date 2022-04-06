/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea_3;

import java.util.Scanner;

/**
 *
 * @author krodr
 */
public class copyMagicSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[][] A = new int[N][N];
        int locationCenter = N/2;
        int LocationColumn = locationCenter;
        int LocationRow = 0;
        A[LocationRow][LocationColumn] = 1;
        
        int currentLocationRow = LocationRow;
        int currentLocationColumn = LocationColumn;
        
        for (int i = 2; i <= Math.pow(A.length, 2); i++) {
            LocationRow--;
            LocationColumn--;
            if (LocationRow < 0) {
                LocationRow = A.length-1;
            }
            if (LocationColumn < 0) {
                LocationColumn = A.length-1;
            }
            if(A[LocationRow][LocationColumn] == 0){
                A[LocationRow][LocationColumn] = i;
            }else{
                LocationRow = currentLocationRow + 1;
                LocationColumn = currentLocationColumn;
                A[LocationRow][LocationColumn] = i;
            }
            currentLocationRow = LocationRow;
            currentLocationColumn = LocationColumn;
        }
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }
}
