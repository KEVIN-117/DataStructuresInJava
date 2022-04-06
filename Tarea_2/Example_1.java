/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea_2;

/**
 *
 * @author krodr
 */
public class Example_1 {
    public static void main(String arg[]){
        int A[]={3,6,2,7,3,5,1};
        int sum=0;
        for(int i=0;i<6;i++){
            if(A[i]>A[i+1]){
                sum=sum+A[i];
            }
        }
        System.out.print(sum);
    }
}

