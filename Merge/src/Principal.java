
import java.util.Scanner;


public class Principal {

    public static void main(String args[]) 
    { 
        //escribir el código aqui
        int opcion;
        Scanner op = new Scanner(System.in);
        System.out.println("Escoja alaguna de las siguientes opciones para ordenar la lista");
        System.out.println("1) Counting Sort");
        System.out.println("2) Radix Sort");
        opcion = op.nextInt();
        switch (opcion) {
            case 1:{
                System.out.println("Counting Sort");
                break;
            }
            case 2:{
                System.out.println("Radix Sort");
                int [] num = new int[15];
                Scanner teclado = new Scanner(System.in);
                System.out.println("Dame 15 numeros con digitos del 1 al 4");
                for (int i = 0; i < num.length; i++) {
                    num[i]=teclado.nextInt();
                }
                System.out.println("La lista obtenida es: ");
                Utilerias.printArray(num);
                //call de RadixSort
                RadixSort.rad(num);
                break;
            }
            default:
                throw new AssertionError();
        }
    } 
} 
    
    

