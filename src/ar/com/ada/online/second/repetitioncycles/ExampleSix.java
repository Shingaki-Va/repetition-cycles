package ar.com.ada.online.second.repetitioncycles;

import java.util.Scanner;

public class ExampleSix {
    public static void main(String[] args) {
        //Se requiere determinar cuántos ceros se encuentran en un arreglo de cuatro renglones y
        //cuatro columnas, las cuales almacenan valores comprendidos entre 0 y 9. Realice el algoritmo y
        //represéntelo mediante el diagrama de flujo y el pseudocódigo.

        int[][] matrix = new int[4][4];
        int ceroCounter = 0;

        Scanner keyboard = new Scanner(System.in);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.println("Ingrese el valor para: " + i + "," + j);
                matrix[i][j] = keyboard.nextInt();
            }
        }
        System.out.println("Su matriz es: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + "|");
            }
            System.out.println(" ");
        }


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {

                if (matrix[i][j] == 0) {
                    ceroCounter += 1;

                }

            }

        }
        System.out.println("La matriz tiene: " + ceroCounter + " cantidades de cero");


    }


}
