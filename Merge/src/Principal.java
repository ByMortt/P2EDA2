
import java.util.Scanner;


public class Principal {

    public static void main(String[] args)
    { 
        //escribir el código aqui
        //add a parameter in where the user after choosing an option, returns to the menu (switch case)
        do{
        //use the scanner class to read the user's choice
        int opcion;
        Scanner op = new Scanner(System.in);
        System.out.println("Escoja alguna de las siguientes opciones para ordenar la lista");
        System.out.println("1) Counting Sort");
        System.out.println("2) Radix Sort");
        System.out.println("3) Merge Sort");
        System.out.println("4) Salir");
        opcion = op.nextInt();
        //use the switch case to choose the option
        switch (opcion) {
            //use the counting sort algorithm to sort the array
            case 1 -> {
                System.out.println("Counting Sort");
                // create an array of 20 elements and the user fills it with numbers from 20 to 28
                int[] num = new int[20];
                Scanner sc = new Scanner(System.in);
                System.out.println("Ingrese 20 números entre 20 y 28");
                for (int i = 0; i < 20; i++) {
                    num[i] = sc.nextInt();
                }
                System.out.println("Lista original: ");
                Utilerias.printArray(num);
                CountingSort.sort(num);
            }
            //use the radix sort algorithm to sort the array
            case 2 -> {
                System.out.println("Radix Sort");
                //use the random class to generate 15 random numbers from 1000 to 4444 and store them in an array
                int[] num1 = new int[15];
                //use the for loop to generate the random numbers
                for (int i = 0; i < 15; i++) {
                    num1[i] = (int) (Math.random() * 4 + 1) * 1000 + (int) (Math.random() * 4 + 1) * 100 + (int) (Math.random() * 4 + 1) * 10 + (int) (Math.random() * 4 + 1);
                }
                System.out.println("Lista original: ");
                Utilerias.printArray(num1);
                System.out.println("Lista ordenada: ");
                RadixSort.rad(num1);
            }
            //use the merge sort algorithm to sort the array
            case 3 ->{
                System.out.println("Merge Sort");
                int[] num2 = new int[15];
                int opcion1;

                do{
                    Scanner op1 = new Scanner(System.in);
                    System.out.println("Escoja alguna de las siguientes opciones:");
                    System.out.println("1) Generar lista aleatoria");
                    System.out.println("2) Mostrar lista original");
                    System.out.println("3) Mostrar lista ordenada");
                    System.out.println("4) Salir");
                    opcion1 = op1.nextInt();
                    switch (opcion1){
                        //case 1
                        case 1 ->//use the method randomArray to generate a random array of 15 elements
                                Utilerias.randomArray(num2);
                        //case 2
                        case 2 ->{
                            //print the original array
                            System.out.println("Lista original: ");
                            Utilerias.printArray(num2);
                        }
                        //case 3
                        case 3 ->{
                            //print the sorted array
                            System.out.println("Lista ordenada: ");
                            MergeSort.sort(num2, 0, num2.length - 1);
                            Utilerias.printArray(num2);
                        }
                        //case 4
                        case 4 ->//break while loop to return to the first menu
                                System.out.println("Salir");
                        //in case the user chooses an option that is not in the menu (1-4) the program will ask the user to choose again
                        default -> System.out.println("Opción no válida");
                    }
                }while (opcion1 != 4);
            }
            case 4 -> {
                //use the system class to exit the program
                System.out.println("Salir");
                System.exit(0);
            }
            //in case the user chooses an option that is not in the menu (1-4) the program will ask the user to choose again
            default -> System.out.println("Opción no válida");
        }
        }while(true);
    }
} 
    
    

