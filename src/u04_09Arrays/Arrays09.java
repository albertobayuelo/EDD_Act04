package u04_09Arrays;

import java.util.Arrays;

/**
 * @author AB
 * @author DC
 */
public class Arrays09 {

    public static void main(String[] args) {
        //Declarar un array
        String[] elementos = new String[11];

        //Rellenar el array con elementos
        elementos[0] = "Cepillo";
        elementos[1] = "Espejo";
        elementos[2] = "Guantes";
        elementos[3] = "Jeringuillas";
        elementos[4] = "Lubricante";
        elementos[5] = "Alcohol";
        elementos[6] = "Gasas";
        elementos[7] = "Sonda";
        elementos[8] = "Tijeras";
        elementos[9] = "Vendas";
        elementos[10] = "Agujas";

        //Imprimir el array
        System.out.println("Array original: " + Arrays.toString(elementos));

        //Ordenar el array
        Arrays.sort(elementos);

        //Imprimir el array
        System.out.println("Array ordenado: " + Arrays.toString(elementos));
        
/*Exactamente, este código utiliza la clase Arrays para trabajar 
con un arreglo de elementos de tipo String, 
donde se inicializa un arreglo de 11 elementos vacíos, 
luego se asignan valores a cada uno de esos elementos, 
se imprime el arreglo original, 
se ordena el arreglo utilizando el método sort de la clase Arrays 
y finalmente se vuelve a imprimir el arreglo ordenado.*/
    }
}
