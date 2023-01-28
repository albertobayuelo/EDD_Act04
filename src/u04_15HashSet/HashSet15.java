package u04_15HashSet;

/**
 *
 * @author AMBV
 */
// Programa de ejemplo para demostrar el uso de la clase HashSet de Java
import java.util.HashSet;

public class HashSet15 {

    public static void main(String[] args) {
        // Crear un conjunto de elementos usando el constructor de la clase HashSet
        HashSet<String> conjunto = new HashSet<String>();

        // Agregar barrios al conjunto
        conjunto.add("El Pozón");
        conjunto.add("La Boquilla");
        conjunto.add("El Bosque");
        conjunto.add("La Estrella");

        // Imprimir el tamaño del conjunto
        System.out.println("El tamaño del conjunto es: " + conjunto.size());

        // Verificar si el conjunto contiene un barrio
        boolean contieneElBosque = conjunto.contains("El Bosque");
        System.out.println("¿El conjunto contiene el barrio El Bosque? " + contieneElBosque);

        // Eliminar un barrio del conjunto
        conjunto.remove("La Boquilla");
        System.out.println("Tamaño del conjunto después de eliminar el barrio La Boquilla: " + conjunto.size());

        // Agregar cinco nuevos barrios
        conjunto.add("El Laguito");
        conjunto.add("San Francisco");
        conjunto.add("La Quinta");
        conjunto.add("El Bosque");
        conjunto.add("El Pozón");
        conjunto.add("El Prado");

        // Mostrar los barrios agregados
        System.out.println("\nBarrios agregados: ");
        for (String str : conjunto) {
            System.out.println(str);
        }

        // Verificar si el conjunto está vacío
        if (conjunto.isEmpty()) {
            System.out.println("El conjunto de barrios de Cartagena esta vacio");
        } else {
            System.out.println("El conjunto de barrios de Cartagena no esta vacio");
        }

        // Vaciar el conjunto
        conjunto.clear();
        System.out.println("\nEl tamaño del conjunto después de vaciarlo es: " + conjunto.size());
        return;
        /*
Con este código se imprimiría el tamaño del conjunto, 
verificaría si el conjunto contiene un barrio, 
eliminaría un barrio del conjunto, agregaría 5 nuevos barrios, 
mostraría los barrios agregados, 
verificaría si el conjunto está vacío y vaciaría el conjunto.
         */
    }
}
