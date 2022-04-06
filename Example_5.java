
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author krodr
 */
public class Example_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int num_1=0;
        int num_2=1;
        int sum = 0 ;
        for(int i=1; i<=number; ++i) {
            num_1 = sum;
            num_2 = num_1;
            sum = num_1+num_2;
            System.out.print(sum +" ");
        }
    }
}
