/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alumno
 */
public class Utilerias {
    static void printArray(int[] arr)
    {
        for (int j : arr) System.out.print(j + " ");
        System.out.println(); 
    }

    //method to generate a random array of 15 elements
    static void randomArray(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            arr[i] = (int)(Math.random()*100);
        }
    }
}
