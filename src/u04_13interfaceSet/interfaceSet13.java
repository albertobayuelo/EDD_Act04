package u04_13interfaceSet;

/**
 *
 * @author DC
 * @author AB
 */
// Programa de ejemplo para demostrar el uso de la interfaz Set de Java
import java.util.HashSet;
import java.util.Set;

public class interfaceSet13 {

    public static void main(String[] args) {
// Crear un conjunto de elementos usando el constructor de la clase HashSet
        Set<String> conjunto = new HashSet<String>();

        // Agregar carreras al conjunto
        conjunto.add("Ingeniería de sistemas");
        conjunto.add("Ingeniería civil");
        conjunto.add("Derecho");
        conjunto.add("Economía");
        conjunto.add("Psicología");
        conjunto.add("Ingeniería ambiental");
        conjunto.add("Educación");
        conjunto.add("Medicina veterinaria");

        // Imprimir el tamaño del conjunto
        System.out.println("El tamaño del conjunto es: " + conjunto.size());

        // Verificar si el conjunto contiene una carrera
        boolean contieneIngenieriaCivil = conjunto.contains("Ingeniería civil");
        System.out.println("¿El conjunto contiene la carrera de Ingeniería civil? " + contieneIngenieriaCivil);

        // Eliminar una carrera del conjunto
        conjunto.remove("Ingeniería ambiental");
        System.out.println("Tamaño del conjunto después de eliminar la carrera de ingeniería ambiental: " + conjunto.size());

        // Verificar si el conjunto está vacío
        if (conjunto.isEmpty()) {
            System.out.println("El conjunto de carreras de la Universidad de Cartagena esta vacio");
        } else {
            System.out.println("El conjunto de carreras de la Universidad de Cartagena no esta vacio");
        }

        //Agregar cinco nuevas carreras
        conjunto.add("Ingeniería de Alimentos");
        conjunto.add("Administración de Empresas");
        conjunto.add("Arquitectura");
        conjunto.add("Diseño Gráfico");
        conjunto.add("Derecho");

        //Mostrar las carreras agregadas
        System.out.println("\nCarreras agregadas: ");
        for (String str : conjunto) {
            System.out.println(str);
        }

        //Vaciar el conjunto
        conjunto.clear();
        System.out.println("\nEl tamaño del conjunto después de vaciarlo es: " + conjunto.size());
        return;
        /*Con este código se imprimiría los elementos del conjunto, 
verificaría si el conjunto está vacío, eliminaría una carrera del conjunto, 
agregaría 5 nuevas carreras y vaciaría el conjunto.*/
    }
}
