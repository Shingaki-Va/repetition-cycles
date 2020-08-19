package ar.com.ada.online.second.repetitioncycles;

import java.util.Scanner;

public class ExampleFive {
    public static void main(String[] args) {
        //Realice un algoritmo que lea un vector de seis elementos e intercambie las posiciones
        //de sus elementos, de tal forma que el primer elemento pase a ser el último y el último el
        //primero, el segundo el penúltimo y así sucesivamente, e imprima ese vector.

        int[] array = new int[6];
        int auxiliaryJ = 1;
        int auxiliaryPosition;

        Scanner keyboard = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.println("ingrese el elemeto en la posicion: " + i);
            array[i] = keyboard.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            auxiliaryPosition = array[i];
            array[i] = array[6 - auxiliaryJ];
            array[6 - auxiliaryJ] = auxiliaryPosition;
            auxiliaryJ += 1;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "|");
        }


    }


}
