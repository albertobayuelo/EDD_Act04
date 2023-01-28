package u04_10interfaceList;

/**
 * @author DC
 * @author AB
 */

import java.util.ArrayList;
import java.util.List;

public class interfaceList10 {

    public static void main(String[] args) {
        // Crear una lista de elementos de una buseta cartagenera
        List<String> elementos = new ArrayList<String>();

        // Agregar elementos a la lista
        elementos.add("Asientos");
        elementos.add("Llantas");
        elementos.add("Volante");
        elementos.add("Varilla de cambios");
        elementos.add("Pickup");
        elementos.add("Espejos retrovisores");
        elementos.add("Frenos");
        elementos.add("Motor");
        elementos.add("Gasolina");
        elementos.add("Brillos de sonido");
        elementos.add("Retrovisores");

        // Imprimir la lista
        System.out.println("Lista de elementos original: " + elementos);

        // Eliminar un elemento de la lista
        elementos.remove("Retrovisores");

        // Imprimir la lista
        System.out.println("Lista de elementos actualizada: " + elementos);

        // Verificar si existe el elemento
        boolean existe = elementos.contains("Pickup");

        // Imprimir el resultado
        System.out.println("¿Existe el elemento 'Pickup' en la lista?: " + existe);
    }
}
