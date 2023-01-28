package u04_19interfaceTreeMap;

/**
 * @author DC
 * @author AB
 */
// Librería 
import java.util.TreeMap;

public class interfaceTreeMap19 {

    public static void main(String[] args) {
        // Declarar el TreeMap 
        TreeMap<Integer, String> mapaEquipoFutbol = new TreeMap<Integer, String>();

        // Añadir elementos al TreeMap 
        mapaEquipoFutbol.put(1, "Casillas");
        mapaEquipoFutbol.put(15, "Ramos");
        mapaEquipoFutbol.put(3, "Pique");
        mapaEquipoFutbol.put(5, "Puyol");
        mapaEquipoFutbol.put(11, "Capdevila");
        mapaEquipoFutbol.put(14, "Xabi Alonso");
        mapaEquipoFutbol.put(16, "Busquets");
        mapaEquipoFutbol.put(8, "Xavi Hernandez");
        mapaEquipoFutbol.put(18, "Pedrito");
        mapaEquipoFutbol.put(6, "Iniesta");
        mapaEquipoFutbol.put(7, "Villa");
        // Imprimir el tamaño del TreeMap
        System.out.println("Tamaño del TreeMap: " + mapaEquipoFutbol.size());

        // Verificar si el TreeMap contiene un elemento
        boolean contienePique = mapaEquipoFutbol.containsValue("Pique");
        System.out.println("¿El TreeMap contiene a Pique? " + contienePique);

        // Eliminar un elemento del TreeMap
        mapaEquipoFutbol.remove(5);
        System.out.println("Tamaño del TreeMap después de eliminar a Puyol: " + mapaEquipoFutbol.size());

        // Obtener el primer elemento del TreeMap
        Integer primerElemento = mapaEquipoFutbol.firstKey();
        System.out.println("Primer elemento del TreeMap: " + mapaEquipoFutbol.get(primerElemento));

        // Obtener el último elemento del TreeMap
        Integer ultimoElemento = mapaEquipoFutbol.lastKey();
        System.out.println("Último elemento del TreeMap: " + mapaEquipoFutbol.get(ultimoElemento));
        // Imprimir todos los elementos del TreeMap
        System.out.println("Todos los elementos del TreeMap: ");
        for (Integer numero : mapaEquipoFutbol.keySet()) {
            System.out.println(numero + ": " + mapaEquipoFutbol.get(numero));
        }
    }
}
