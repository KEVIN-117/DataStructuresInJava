
package Tarea_2;
import java.util.Scanner;
/*
 * @author krodr
 * 4. Realice un programa que permita insertar N números en un vector, 
 * posteriormente visualice cuántosnúmeros son mayores al último y cuántos son menores al último
 * Ejemplo: 
 * Entrada               Salida
    7                     2 4
    1 15 3 9 2 3 5
 */
public class Example_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < A.length; i++) {
            A[i] = input.nextInt();
        }
        int ultimo = A[A.length-1];
        int counterGreater = 0;
        int counterMinor = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] < ultimo) {
                counterMinor++;
            }else if(A[i] > ultimo){
                counterGreater++;
            }
        }
        System.out.print(counterGreater + " " + counterMinor);
    }
}
