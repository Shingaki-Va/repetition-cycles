package ar.com.ada.online.second.repetitioncycles;

import java.util.Scanner;

public class ExampleThree {
    public static void main(String[] args) {

        //Se tienen los nombres de los N alumnos de una escuela, además de su promedio
        //general. Realice un algoritmo para capturar esta información, la cual se debe almacenar en
        //arreglos, un vector para el nombre y otro para el promedio, después de capturar la información
        //se debe ordenar con base en su promedio, de mayor a menor, los nombres deben corresponder
        //con los promedios

        double[] average;
        String[] names;
        int students;
        double auxiliarPromedio;
        String auxiliarNombre;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de alumnos: ");
        students = keyboard.nextInt();

        average = new double[students];
        names = new String[students];

        for (int i = 0; i < average.length; i++) {
            System.out.println("ingrese el nombre del alumno: " + i);
            names[i] = keyboard.next();
            System.out.println("Ingrese el promedio del alumno " + names[i]);
            average[i] = keyboard.nextDouble();
        }
        for (int i = 0; i < average.length; i++) {
            for (int j = 0; j < average.length; j++) {
                if (average[j] < average[i]) {
                    auxiliarPromedio =average[i];
                    auxiliarNombre=names[i];
                    average[i]=average[j];
                    names[i]=names[j];
                    average[j]=auxiliarPromedio;
                    names[j]=auxiliarNombre;
                }
            }
        }
        for (int i = 0; i <average.length ; i++) {
            System.out.println(names[i]+" "+average[i]);

        }

    }


}
