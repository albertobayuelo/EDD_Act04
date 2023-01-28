package u04_07CollectionCollections;

/**
 *
 * @author AB
 *
 * @author DC
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionCollections07 {

    public static void main(String[] args) {
// Creamos una lista de productos de una tienda de juguetes eróticos
        List<String> productos = new ArrayList<>();
        productos.add("Vibrador");
        productos.add("Anillos");
        productos.add("Lubricante");
        productos.add("Consoladores");

        System.out.println("Lista de productos original:");
        for (String producto : productos) {
            System.out.println(producto);
        }

        // Usamos el método sort de la clase Collections para ordenar
        // la lista de productos alfabéticamente
        Collections.sort(productos);

        // Mostramos la lista de productos ordenada alfabéticamente
        System.out.println("\nLista de productos ordenada:");
        for (String producto : productos) {
            System.out.println(producto);
        }
    }
}
