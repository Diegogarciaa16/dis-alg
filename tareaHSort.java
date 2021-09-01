import java.util.*;

public class tareaHSort {

    public static void main(String args[]){
        int[] arreglo = { 23, 9, 17, 3, 12, 8};
        int[] ordenado = hSort(arreglo);
        System.out.println(Arrays.toString(ordenado));
    }

    public static int[] hSort(int[] arreglo){
        PriorityQueue<Integer> cola = new PriorityQueue<>();
        for(int numero : arreglo){
        cola.add(numero);
        }
        int[] salida = new int[arreglo.length];
        int contador = 0;
        while(cola.isEmpty() == false){
            salida[contador] = cola.poll();
            contador++;
        }
        return salida;
    }
}