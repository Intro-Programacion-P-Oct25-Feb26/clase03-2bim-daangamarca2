/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

/**
 *
 * @author reroes
 */
public class Ejemplo03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creación de arreglo bidimensionales
        
        int[][] arreglo1 = new int[3][10];
        int[] arregloUnidimensional;
        System.out.printf("Uso de la opción length: %d\n", arreglo1.length);
        
        for (int fila = 0; fila < arreglo1.length; fila++) {
            arregloUnidimensional = arreglo1[fila]; // como obtener el tamaño 
                                                    // del arreglo unidensional 
                                                    // en funcion de la columnas
            System.out.printf("La fila es: %d\n", fila);
            System.out.printf("El tamaño de su columna es: %d\n", 
                    arregloUnidimensional.length);
            
            
            System.out.println("--------------------------------");
            /*
            System.out.printf("Tamaño del arreglo de cada fila (por el número "
                    + "de columnas) %d - posición de la fila: %d\n", 
                    arregloUnidimensional.length, fila);
            */
        }
    }
    
}
