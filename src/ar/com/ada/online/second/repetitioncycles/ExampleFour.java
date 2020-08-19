package ar.com.ada.online.second.repetitioncycles;


import sun.java2d.loops.ScaledBlit;

import java.util.Scanner;

public class ExampleFour {

    //Cierta empresa requiere controlar la existencia de diez productos, los cuales se
    //almacenan en un vector A, mientras que los pedidos de los clientes de estos productos se
    //almacenan en un vector B. Se requiere generar un tercer vector C con base en los anteriores que
    //represente lo que se requiere comprar para mantener el stock de inventario, para esto se
    //considera lo siguiente: si los valores correspondientes de los vectores A y B son iguales se
    //almacena este mismo valor, si el valor de B es mayor que el de A se almacena el doble de la
    //diferencia entre B y A, si se da el caso de que A es mayor que B, se almacena B, que indica lo
    //que se requiere comprar para mantener el stock de inventario.

    public static void main(String[] args) {
        int[] arrayA = new int[3];
        int[] arrayB = new int[3];
        int[] arrayC = new int[3];

        Scanner keyboard = new Scanner(System.in);


        for (int i = 0; i < arrayA.length; i++) {
            System.out.println("Ingrese el stock del producto codigo: "+i);
            arrayA[i] = keyboard.nextInt();
            System.out.println("Ingrese el pedido de Clientes del producto: "+i);
            arrayB[i]=keyboard.nextInt();
        }
        for (int i = 0; i < arrayA.length; i++) {
            if (arrayA==arrayB){
                arrayC[i]=(arrayB[i]-arrayA[i])*2;

            }else {
                arrayC[i]=arrayB[i];
            }

        }
        for (int i = 0; i <arrayA.length ; i++) {
            System.out.print("Debe comprar: "+arrayC[i]+" articulos del producto codigo: "+i);
            System.out.println(" ");
        }



    }




}
