/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea_2;
import java.util.Scanner;
/**
 * @author krodr
 * 7. Realice un programa que permita introducir N números en un vector y 
 * posteriormente visualice el número que más se repite.
 *      Ejemplo: 
 *      Entrada                 Salida
        8                       2
        5 6 5 2 6 2 4 2
 */
public class Example_7 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int N = input.nextInt();
        int[] A=new int[N];
        for(int i = 0; i < N; i++){
            A[i]= input.nextInt();
        }
        
        int numberRepeat = 0;
        int counterNumberRepeat = 0;
        for(int j = 0; j < N; j++){
            int counter = 0;
            int auxiliary = A[j];
            for(int k = 0; k < N; k++)
                if(A[k] == auxiliary)
                    counter++;
            if(counter > counterNumberRepeat){
                numberRepeat = auxiliary;
                counterNumberRepeat = counter;
            }
        }
        System.out.println(numberRepeat);
    }
}
