package ar.com.ada.online.second.repetitioncycles;

import java.util.Scanner;

public class ExampleSeven {
    public static void main(String[] args) {
//La empresa de transportes “The Big Old” cuenta con N choferes, de los cuales se
//conoce su nombre y los kilómetros que conducen durante cada día de la semana, esa
//información se guarda en un arreglo de N x 6. Se requiere un algoritmo que capture esa
//información y genere un vector con el total de kilómetros que recorrió cada chofer durante la
//semana. Realice el algoritmo y represéntelo mediante el diagrama de flujo y el pseudocódigo. Al
//final se debe presentar un reporte donde se muestre el nombre del chofer, los kilómetros
//recorridos cada día y el total de éstos, tal y como se muestra en la figura 3.1.


        int numberOfDrivers;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("ingrese la cantidad de choferes");
        numberOfDrivers = keyboard.nextInt();

        String[] driversName = new String[numberOfDrivers];
        int[][] kilometres = new int[numberOfDrivers][6];
        int[] totalKilometres = new int[numberOfDrivers];

        for (int i = 0; i < numberOfDrivers; i++) {
            System.out.println("Ingrse el nombre del chofer N°:"+(i+1));
            driversName[i] = keyboard.next();
            for (int j = 0; j < 6; j++) {
                System.out.println("ingrse los km recorridos el día: "+(j+1));
                kilometres[i][j] = keyboard.nextInt();
            }
        }
        for (int i = 0; i <numberOfDrivers ; i++) {
            totalKilometres[i]=0;
            for (int j = 0; j <6 ; j++) {
                totalKilometres[i]=totalKilometres[i]+kilometres[i][j];
            }
        }
        for (int i = 0; i <numberOfDrivers ; i++) {
            System.out.println(driversName[i]);
            for (int j = 0; j <6 ; j++) {
                System.out.print("El día "+(j+1)+" recorrió "+kilometres[i][j]+"km");
                System.out.println("");


            }
            System.out.println("total de km recorridos en la semana fue de: "+totalKilometres[i]+"km");
            System.out.println("--------------------------------");
        }





    }
}
