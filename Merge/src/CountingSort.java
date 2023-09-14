/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Arrays;

/**
 *
 * @author alumno
 */
public class CountingSort {
    //function to do counting sort (the array is obtained from class Principal (and array of 20 elements with numbers from 20 to 28): first create an array to do the count of the elements and print it, then realize the sum of the elements and print it, then create an array to store the sorted elements and print the steps of how every element is sorted
    static void sort(int[] arr)
    {
        int n = arr.length;
        int[] count = new int[10];
        int[] output = new int[n];
        System.out.println("Arreglo de conteo: ");
        Utilerias.printArray(count);
        System.out.println("Arreglo de salida: ");
        Utilerias.printArray(output);
        for (int j : arr) {
            count[j - 20]++;
            System.out.println("Arreglo de conteo: ");
            Utilerias.printArray(count);
        }
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
            System.out.println("Arreglo de conteo: ");
            Utilerias.printArray(count);
        }
        for (int i = n - 1; i >= 0; i--) {
            output[count[arr[i] - 20] - 1] = arr[i];
            count[arr[i] - 20]--;
            System.out.println("Arreglo de salida: ");
            Utilerias.printArray(output);
            System.out.println("Arreglo de conteo: ");
            Utilerias.printArray(count);
        }
        System.out.println("Arreglo de salida: ");
        Utilerias.printArray(output);
        System.out.println("Arreglo de conteo: ");
        Utilerias.printArray(count);
        System.out.println("Arreglo original: ");
        Utilerias.printArray(arr);
        System.out.println("Arreglo ordenado: ");
        Utilerias.printArray(output);
    }
}
