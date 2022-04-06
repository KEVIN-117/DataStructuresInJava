
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author krodr
 */
public class multiplos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        int contador = 0;
        int i = 1;
        while (contador < A) {            
            if (i%3 == 0 || i%5 == 0) {
                System.out.print(i+" ");
                contador++;
            }
            i++;
        }
    }
}
