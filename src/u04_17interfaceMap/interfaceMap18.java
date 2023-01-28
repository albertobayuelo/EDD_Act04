package u04_17interfaceMap;

/**
 *@author DC
 * @author AB
 */
// Programa de ejemplo para demostrar el uso de la interface Map de Java
import java.util.HashMap;
import java.util.Map;

public class interfaceMap18 {
   public static void main(String[] args) {
      // Crear un mapa usando el constructor de la clase HashMap
      Map<String, Integer> mapa = new HashMap<String, Integer>();
      
      // Agregar elementos al mapa
      mapa.put("Jaguar", 1);
      mapa.put("Ocelote", 2);
      mapa.put("Lince", 3);
      mapa.put("Puma", 4);
      mapa.put("Cougar", 5);
      mapa.put("Leopardo", 6);
      
      // Imprimir el tamaño del mapa
      System.out.println("El tamaño del mapa es: " + mapa.size());
      
      // Verificar si el mapa contiene un elemento
      boolean contieneElemento3 = mapa.containsKey("Lince");
      System.out.println("¿El mapa contiene el animal Lince? " + contieneElemento3);
      
      // Eliminar un elemento del mapa
      mapa.remove("Puma");
      System.out.println("Tamaño del mapa después de eliminar el animal Puma: " + mapa.size());
      
      // Imprimir los elementos del mapa
        System.out.println("\nLos elementos del mapa son: ");
        for (Map.Entry<String, Integer> entry : mapa.entrySet()) {
            System.out.println("Animal: " + entry.getKey() + " - Número de ejemplares: " + entry.getValue());
/*
El tamaño del mapa es: 6
¿El mapa contiene el animal Lince? true
Tamaño del mapa después de eliminar el animal Puma: 5

Los elementos del mapa son: 
Animal: Lince - Número de ejemplares: 3
Animal: Leopardo - Número de ejemplares: 6
Animal: Jaguar - Número de ejemplares: 1
Animal: Cougar - Número de ejemplares: 5
Animal: Ocelote - Número de ejemplares: 2
            */
        }
   }
}



