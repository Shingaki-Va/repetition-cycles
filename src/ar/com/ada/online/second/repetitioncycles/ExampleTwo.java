package ar.com.ada.online.second.repetitioncycles;

import java.util.Scanner;

public class ExampleTwo {
    public static void main(String[] args) {
        //Se requiere un algoritmo para obtener un vector (C) de N elementos que contenga la
        //suma de los elementos correspondientes de otros dos vectores (A y B). Represéntelo mediante
        //el diagrama de flujo y el pseudocódigo.

        int[] arrayA;
        int[] arrayB;
        int[] arrayC;
        int sizeArray;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese el tamaño de los arreglos: ");
        sizeArray = keyboard.nextInt();

        arrayA = new int[sizeArray];
        arrayB = new int[sizeArray];
        arrayC = new int[sizeArray];

        for (int i = 0; i < sizeArray; i++) {
            System.out.print("Ingrese el valor para el arreglo A en la posicion " + i + ": ");
            arrayA[i] = keyboard.nextInt();

            System.out.print("Ingrese el valor para el arreglo B en la posicion " + i + ": ");
            arrayB[i] = keyboard.nextInt();
        }

        for (int i = 0; i < arrayA.length; i++) {
            arrayC[i] = arrayA[i] + arrayB[i];
        }

        System.out.println("El resultado de la suma de los elementos de los arreglos A y B es: ");
        for (int i = 0; i < arrayB.length; i++) {
            System.out.printf("indice: %d, valor: %d\n", i, arrayC[i]);
        }






    }
}
