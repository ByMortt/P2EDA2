/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.LinkedList;
import java.util.Queue;
        
public class RadixSort {
    static void rad(int[] args){
        Queue<Integer> cola1 = new LinkedList<>();
        Queue<Integer> cola2 = new LinkedList<>();
        Queue<Integer> cola3 = new LinkedList<>();
        Queue<Integer> cola4 = new LinkedList<>();
        //para el cuarto digito
        //loop to store the numbers in the queues
        for (int i = 0; i < 15; i++) {
            if (args[i]%10 == 1) {
                cola1.offer(args[i]);
            }else if (args[i]%10 == 2) {
                cola2.offer(args[i]);
            }else if (args[i]%10 == 3) {
                cola3.offer(args[i]);
            }else if (args[i]%10 == 4) {
                cola4.offer(args[i]);
            }
        }
        int j, p;
        System.out.println("Cola 1: "+cola1);
        System.out.println("Cola 2: "+cola2);
        System.out.println("Cola 3: "+cola3);
        System.out.println("Cola 4: "+cola4);
        //loop to store the numbers in the array
        for (j = 0; j < 15; j++) {
            if (cola1.peek()== null) {break;}
            args[j]=cola1.peek();
            cola1.poll();
        }
        for (; j < 15; j++) {
            if (cola2.peek()== null) {break;}
            args[j]=cola2.peek();
            cola2.poll();
        }
        for (; j < 15; j++) {
            if (cola3.peek()== null) {break;}
            args[j]=cola3.peek();
            cola3.poll();
        }
        for (; j < 15; j++) {
            if (cola4.peek()== null) {break;}
            args[j]=cola4.peek();
            cola4.poll();
        }
        System.out.println("Colas vacias cola1: " + cola1 + " cola2: " + cola2 + " cola3: " + cola3 + " cola4: " + cola4);
        System.out.println("Lista resultante:");
        Utilerias.printArray(args);
        
        //3er dìgito
        //loop to store the numbers in the queues again
        for (int i = 0; i < 15; i++) {
            p=args[i]/10;
            if (p%10==1) {
                cola1.offer(args[i]);
            }else if (p%10==2) {
                cola2.offer(args[i]);
            }else if (p%10==3) {
                cola3.offer(args[i]);
            }else if (p%10==4) {
                cola4.offer(args[i]);
            }
        }
        System.out.println("Cola 1: "+cola1);
        System.out.println("Cola 2: "+cola2);
        System.out.println("Cola 3: "+cola3);
        System.out.println("Cola 4: "+cola4);
        //loop to store the numbers in the array again
        for (j = 0; j < 15; j++) {
            if (cola1.peek()== null) {break;}
            args[j]=cola1.peek();
            cola1.poll();
        }
        for (; j < 15; j++) {
            if (cola2.peek()== null) {break;}
            args[j]=cola2.peek();
            cola2.poll();
        }
        for (; j < 15; j++) {
            if (cola3.peek()== null) {break;}
            args[j]=cola3.peek();
            cola3.poll();
        }
        for (; j < 15; j++) {
            if (cola4.peek()== null) {break;}
            args[j]=cola4.peek();
            cola4.poll();
        }
        System.out.println("Colas vacias cola1: " + cola1 + " cola2: " + cola2 + " cola3: " + cola3 + " cola4: " + cola4);
        System.out.println("Lista resultante:");
        Utilerias.printArray(args);
        
        //Para el segundo dìgito
        //loop to store the numbers in the queues again
        for (int i = 0; i < 15; i++) {
            p=args[i]/10/10;
            if (p%10==1) {
                cola1.offer(args[i]);
            }else if (p%10==2) {
                cola2.offer(args[i]);
            }else if (p%10==3) {
                cola3.offer(args[i]);
            }else if (p%10==4) {
                cola4.offer(args[i]);
            }
        }
        System.out.println("Cola 1: "+cola1);
        System.out.println("Cola 2: "+cola2);
        System.out.println("Cola 3: "+cola3);
        System.out.println("Cola 4: "+cola4);
        //loop to store the numbers in the array again
        for (j = 0; j < 15; j++) {
            if (cola1.peek()== null) {break;}
            args[j]=cola1.peek();
            cola1.poll();
        }
        for (; j < 15; j++) {
            if (cola2.peek()== null) {break;}
            args[j]=cola2.peek();
            cola2.poll();
        }
        for (; j < 15; j++) {
            if (cola3.peek()== null) {break;}
            args[j]=cola3.peek();
            cola3.poll();
        }
        for (; j < 15; j++) {
            if (cola4.peek()== null) {break;}
            args[j]=cola4.peek();
            cola4.poll();
        }
        System.out.println("Colas vacias cola1: " + cola1 + " cola2: " + cola2 + " cola3: " + cola3 + " cola4: " + cola4);
        System.out.println("Lista resultante:");
        Utilerias.printArray(args);
        
        //para el primer digito
        //loop to store the numbers in the queues again
        for (int i = 0; i < 15; i++) {
            p=args[i]/10/10/10;
            if (p%10==1) {
                cola1.offer(args[i]);
            }else if (p%10==2) {
                cola2.offer(args[i]);
            }else if (p%10==3) {
                cola3.offer(args[i]);
            }else if (p%10==4) {
                cola4.offer(args[i]);
            }
        }
        System.out.println("Cola 1: "+cola1);
        System.out.println("Cola 2: "+cola2);
        System.out.println("Cola 3: "+cola3);
        System.out.println("Cola 4: "+cola4);
        //loop to store the numbers in the array again
        for (j = 0; j < 15; j++) {
            if (cola1.peek()== null) {break;}
            args[j]=cola1.peek();
            cola1.poll();
        }
        for (; j < 15; j++) {
            if (cola2.peek()== null) {break;}
            args[j]=cola2.peek();
            cola2.poll();
        }
        for (; j < 15; j++) {
            if (cola3.peek()== null) {break;}
            args[j]=cola3.peek();
            cola3.poll();
        }
        for (; j < 15; j++) {
            if (cola4.peek()== null) {break;}
            args[j]=cola4.peek();
            cola4.poll();
        }
        System.out.println("Colas vacias cola1: " + cola1 + " cola2: " + cola2 + " cola3: " + cola3 + " cola4: " + cola4);
        //print the sorted array
        System.out.println("Lista resultante:");
        Utilerias.printArray(args);
    }
}
