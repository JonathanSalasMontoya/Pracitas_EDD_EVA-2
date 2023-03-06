
import static com.mycompany.eva_2_1_cambiar_tama_arreglo.EVA_2_1_CAMBIAR_TAMA_ARREGLO.cambiarTama;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author jonat
 */
public class EVA_2_2_CAMBIAR_TAMA_ARREEGLO_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arreglo = new int[1];

        //este for simula los clientes:
        //cada ciclo representa un cliente nuevo 
        //cada ciclo incremente el tamaño del arreglo en 1 
        //O (N*N)
        for (int i = 1; i < 1000000; i++) {
            int[] copia = cambiarTama(arreglo, i);
            //guardar los datos del clien te
            copia[i - 1] = (int)(Math.random() * 100);
            arreglo = copia;
        }
    }

    public static int[] cambiarTama(int[] arreglo, int tama) {
        int[] copia = new int[tama];
        for (int i = 0; i < arreglo.length; i++) {
            if (i < arreglo.length) {
                copia[i] = arreglo[i];
            }
        }
        return copia;
    }
}
