package u04_18interfaceHashMap;
/**
 * @author DC
 * @author AB
 */
import java.util.HashMap;
public class interfaceHashMap18 {
    public static void main(String[] args){
        // Creación de un objeto HashMap con el tipo de dato especificado en las llaves y valores
        HashMap<String, Integer> mapaAves = new HashMap<>();

        // Agregar valores a la HashMap
        mapaAves.put("Águila", 10);
        mapaAves.put("Halcón", 30);
        mapaAves.put("Gavilán", 20);
        mapaAves.put("Búho", 40);
        mapaAves.put("Cóndor", 5);

        // Verificar el tamaño de la HashMap
        System.out.println("Tamaño del mapa de aves es: " + mapaAves.size());

        // Imprimir el contenido de la HashMap
        System.out.println(mapaAves);

        // Verificar si un valor existe en la HashMap
        if(mapaAves.containsKey("Águila")){
            Integer numeroAguilas = mapaAves.get("Águila");
            System.out.println("El número de águilas es: " + numeroAguilas);
        }
    }
    /*Tamaño del mapa de aves es: 5
{Cóndor=5, Águila=10, Gavilán=20, Halcón=30, Búho=40}
El número de águilas es: 10*/
}