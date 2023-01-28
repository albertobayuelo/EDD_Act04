package u04_16TreeSet;

/**
 * @author DC
 * @author AB
 */
import java.util.TreeSet;

public class TreeSet16 {

    public static void main(String[] args) {
        // Crear un conjunto de elementos ordenados usando el constructor de la clase TreeSet
        TreeSet<String> conjuntoOrdenado = new TreeSet<String>();

        // Agregar elementos al conjunto ordenado
        conjuntoOrdenado.add("Naranja");
        conjuntoOrdenado.add("Lima");
        conjuntoOrdenado.add("Mandarina");
        conjuntoOrdenado.add("Clementina");

        // Imprimir el tamaño del conjunto ordenado
        System.out.println("El tamaño del conjunto ordenado es: " + conjuntoOrdenado.size());

        // Verificar si el conjunto ordenado contiene un elemento
        boolean contieneNaranja = conjuntoOrdenado.contains("Naranja");
        System.out.println("¿El conjunto ordenado contiene la naranja? " + contieneNaranja);

        // Eliminar un elemento del conjunto ordenado
        conjuntoOrdenado.remove("Mandarina");
        System.out.println("Tamaño del conjunto ordenado después de eliminar la mandarina: " + conjuntoOrdenado.size());

        // Agregar cinco nuevos elementos al conjunto ordenado
        conjuntoOrdenado.add("Lima");
        conjuntoOrdenado.add("Pomelo");
        conjuntoOrdenado.add("Mango");
        conjuntoOrdenado.add("Fresa");
        conjuntoOrdenado.add("Sandía");

        // Imprimir los elementos del conjunto ordenado después de agregar los nuevos elementos
        System.out.println("\nLos elementos del conjunto ordenado después de agregar los nuevos elementos son: ");
        for (String fruta : conjuntoOrdenado) {
            System.out.println(fruta);
        }

        // Obtener el elemento anterior al elemento especificado en el conjunto ordenado
        String elementoAnterior = conjuntoOrdenado.lower("Pomelo");
        System.out.println("\nElemento anterior al pomelo en el conjunto ordenado: " + elementoAnterior);

        // Obtener el elemento siguiente al elemento especificado en el conjunto ordenado
        String elementoSiguiente = conjuntoOrdenado.higher("Pomelo");
        System.out.println("\nElemento siguiente al pomelo en el conjunto ordenado: " + elementoSiguiente);

// Agregar cinco nuevos elementos
        conjuntoOrdenado.add("Mango");
        conjuntoOrdenado.add("Fresa");
        conjuntoOrdenado.add("Uva");
        conjuntoOrdenado.add("Piña");
        conjuntoOrdenado.add("Lima");

// Mostrar los elementos del conjunto ordenado
        System.out.println("\nLos elementos del conjunto ordenado después de agregar 5 nuevos son:");
        for (String elemento : conjuntoOrdenado) {
            System.out.println(elemento);
        }

// Vaciar el conjunto ordenado
        conjuntoOrdenado.clear();
        System.out.println("\nEl tamaño del conjunto ordenado después de vaciarlo es: " + conjuntoOrdenado.size());
        return;
        /*
        Con este código se crea un conjunto ordenado de elementos de vendedor 
        de jugos de naranja, se verifica si el conjunto contiene un elemento 
        específico, se elimina un elemento del conjunto, 
        se obtiene el elemento anterior y 
        siguiente a un elemento específico en el conjunto, 
        se agrega cinco nuevos elementos, 
        se muestra los elementos del conjunto ordenado 
        y se vacía el conjunto ordenado.
         */
    }
}
