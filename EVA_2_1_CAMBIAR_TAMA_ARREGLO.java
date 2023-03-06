/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.eva_2_1_cambiar_tama_arreglo;

import java.util.Arrays;

/**
 *
 * @author jonat
 */
public class EVA_2_1_CAMBIAR_TAMA_ARREGLO {

    public static void main(String[] args) {
        int[] arreglo = new int[3];
        arreglo[0] = 100;
        arreglo[1] = 200;
        arreglo[2] = 300;
        //expandir el arreglo a tamaño 10 sin perder los datos
        //int[] copia = Arrays.copyOf(arreglo, 10);
        int [] copia = cambiarTama(arreglo, 2);
        for (int valor : copia) {
            System.out.print("[ " + valor + " ]");
        }
    }

    public static int[] cambiarTama(int[] arreglo, int tama) {
        int[] copia = new int[tama];
        for (int i = 0; i < arreglo.length; i++) {
            if(i < arreglo.length)
            copia [i] = arreglo [i];
        }
        return copia;
    }
}
