/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea_2;

/**
 *
 * @author krodr
 */
public class Example_3 {
    public static void main(String arg[]){
        int A[]={7,9,2,8,3};
        for(int i=0;i<5;i++){
            for(int j=0;j<(4-i);j++){
                if(A[j]>A[j+1]){
                    int aux=A[j];
                    A[j]=A[j+1];
                    A[j+1]=aux;
                }
            }
        }
        for(int k=0;k<5;k++)
            System.out.print(A[k]+" ");
    }
}
