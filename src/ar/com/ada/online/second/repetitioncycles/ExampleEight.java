package ar.com.ada.online.second.repetitioncycles;

import java.util.Scanner;

public class ExampleEight {
    public static void main(String[] args) {
        //En un arreglo se tienen registradas las ventas de cinco empleados durante cinco días de
        //la semana. Se requiere determinar cuál fue la venta mayor realizada. R


        Scanner keyboard = new Scanner(System.in);
        double[] sale = new double[5];
        double bestSale=0;

        for (int i = 0; i <sale.length ; i++) {
            System.out.println("ingrese las ventas del vendedor N°"+(i+1));
            sale[i]=keyboard.nextDouble();
        }
        for (int i = 0; i <sale.length ; i++) {
            if (sale[i]>bestSale){
                bestSale=sale[i];

            }

        }
        System.out.println("La mayor venta fue de: $"+bestSale);

    }


}
