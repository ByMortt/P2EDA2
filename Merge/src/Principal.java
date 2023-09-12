
import java.util.Scanner;


public class Principal {

    public static void main(String[] args)
    { 
        //escribir el código aqui
        int opcion;
        Scanner op = new Scanner(System.in);
        System.out.println("Escoja alaguna de las siguientes opciones para ordenar la lista");
        System.out.println("1) Counting Sort");
        System.out.println("2) Radix Sort");
        opcion = op.nextInt();
        switch (opcion) {
            case 1 -> System.out.println("Counting Sort");
            case 2 -> {
                System.out.println("Radix Sort");
                //usa la libreria random para generar numeros de cuatro dígitos (cada dígito es un número aleatorio entre 1 y 4, ejemplo 1111, 12344, 1342) y los guarda en un arreglo de 15 elementos
                int[] num1 = new int[15];
                for (int i = 0; i < 15; i++) {
                    num1[i] = (int) (Math.random() * 4 + 1) * 1000 + (int) (Math.random() * 4 + 1) * 100 + (int) (Math.random() * 4 + 1) * 10 + (int) (Math.random() * 4 + 1);
                }
                System.out.println("Lista original: ");
                Utilerias.printArray(num1);
                System.out.println("Lista ordenada: ");
                RadixSort.rad(num1);
            }
            default -> throw new AssertionError();
        }
    }
} 
    
    

