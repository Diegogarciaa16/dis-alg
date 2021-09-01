import java.util.*;

public class tareaBSearch {
    
    public static void main(String args[]){
        int[] arreglo = { 6, 30, 14, 2, 67, 15};
        Arrays.sort(arreglo);
        System.out.println(Arrays.toString(arreglo));
        int buscaIndice = bSearch(arreglo, 0, (arreglo.length-1), 14);
        System.out.println(buscaIndice);
    }

    public static int bSearch(int[] arreglo, int bajo, int alto, int busqueda){
        int medio = 0;
        int indice = -1;
        
        if(bajo > alto){
            return -1;
        }
        medio = ((bajo + alto)/2);

        if(busqueda == arreglo[medio]){
            return medio;
        } 
        else if(busqueda < arreglo[medio]){
            indice = bSearch(arreglo, bajo, (medio-1), busqueda);
        } 
        else if(busqueda > arreglo[medio]){
            indice = bSearch(arreglo, (medio+1), alto, busqueda);
        }
        return indice;
    }   
}