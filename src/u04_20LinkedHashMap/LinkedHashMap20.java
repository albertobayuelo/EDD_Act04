package u04_20LinkedHashMap;

/**
 * @author DC
 * @author AB
 */
//Importamos la librería LinkedHashMap 
import java.util.LinkedHashMap;

public class LinkedHashMap20 {
    //Creamos una instancia de LinkedHashMap 

    LinkedHashMap<String, Integer> mapaAves = new LinkedHashMap<>();

    public void ejemplo() {
        //Agregamos elementos a nuestro LinkedHashMap
        mapaAves.put("PájaroBobo", 1);
        mapaAves.put("Flamenco", 2);
        mapaAves.put("Gaviota", 3);
        mapaAves.put("Garcita", 4);
        mapaAves.put("Palomas", 5);
        
        //Usamos el método get() para obtener el valor de una clave
        int numeroAves = mapaAves.get("Flamenco");
        System.out.println("Número de flamencos: " + numeroAves);

        //Usamos el método remove() para eliminar una clave y su valor
        mapaAves.remove("Garcita");

        //Usamos el método containsKey() para saber si existe una clave en el Map
        boolean existeClave = mapaAves.containsKey("Flamenco");
        System.out.println("¿Existe la clave 'Flamenco'? " + existeClave);

        //Usamos el método keySet() para obtener las claves del Map
        System.out.println("Claves del mapa: " + mapaAves.keySet());
    }

    public static void main(String[] args) {
        LinkedHashMap20 obj = new LinkedHashMap20();
        obj.ejemplo();
    }
/*
    Número de flamencos: 2
¿Existe la clave 'Flamenco'? true
Claves del mapa: [PájaroBobo, Flamenco, Gaviota, Palomas]
    */
}
