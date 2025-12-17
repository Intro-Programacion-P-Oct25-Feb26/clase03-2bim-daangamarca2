/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete05;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author A S U S A16
 */
public class Ejercicio {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String[] nombresClientes = new String[5];
        double[][] produccionMensual = new double[5][12];
        double[] totalMensual = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el nombre del encargado de la estación ");
            nombresClientes[i] = entrada.nextLine();
            double sumaEstacion = 0;
            
            for (int j = 0; j < 12; j++) {
                System.out.println("Mes " + (j + 1));
                produccionMensual[i][j] = entrada.nextDouble();
                sumaEstacion = sumaEstacion + produccionMensual[i][j];
            }
            totalMensual[i] = sumaEstacion;
            entrada.nextLine();
        }

        double produccionTotal = totalMensual[0];
        int indice = 0;

        for (int i = 0; i < 5; i++) {
            if (totalMensual[i] > produccionTotal) {
                produccionTotal = totalMensual[i];
                indice = i;
            }
        }

        System.out.println("\nANALISIS DE PRODUCCION FINAL");
        System.out.println("ESTACION");

        for (int i = 0; i < 5; i++) {
            System.out.printf("%s Estación %d - Total Producción: $ %.2f\n",
                    nombresClientes[i], i+1, totalMensual[i]);
        }
        System.out.printf("\nEstación más productiva: %s\nEncargado de la "
                + "estación: %s\nCantidad de la estación más productiva: $ "
                + "%.2f\n",nombresClientes[indice], nombresClientes[indice],
                produccionTotal);
    }
}
