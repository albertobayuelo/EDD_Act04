package u04_14SortedSet;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @author DC
 * @author AB
 */
public class SortedSet14 {

   public static void main(String[] args) {
      // Crear un conjunto de elementos ordenados usando el constructor de la clase TreeSet
      SortedSet conjuntoOrdenado = new TreeSet();


  // Agregar elementos al conjunto ordenado
  conjuntoOrdenado.add("Medellín");
  conjuntoOrdenado.add("Bogotá");
  conjuntoOrdenado.add("Cali");
  conjuntoOrdenado.add("Barranquilla");

  // Imprimir el tamaño del conjunto ordenado
  System.out.println("El tamaño del conjunto ordenado es: " + conjuntoOrdenado.size());

  // Verificar si el conjunto ordenado contiene un elemento
  boolean contieneBogota = conjuntoOrdenado.contains("Bogotá");
  System.out.println("¿El conjunto ordenado contiene el pueblo Bogotá? " + contieneBogota);

  // Eliminar un elemento del conjunto ordenado
  conjuntoOrdenado.remove("Barranquilla");
  
  // Mostrar los elementos del conjunto ordenado después de eliminar el elemento Barranquilla
  System.out.println("\nElementos del conjunto ordenado despues de eliminar el pueblo Barranquilla:");
  for (Object elemento : conjuntoOrdenado) {
      System.out.println(elemento);
  }
  
  // Agregar cinco nuevos pueblos
  conjuntoOrdenado.add("Cartagena");
  conjuntoOrdenado.add("Santa Marta");
  conjuntoOrdenado.add("Pereira");
  conjuntoOrdenado.add("Bucaramanga");
  conjuntoOrdenado.add("Cúcuta");
  
  // Obtener el primer y último elemento del conjunto ordenado
  Object primerPueblo = conjuntoOrdenado.first();
  System.out.println("\nPrimer pueblo del conjunto ordenado: " + primerPueblo);

  Object ultimoPueblo = conjuntoOrdenado.last();
  System.out.println("\nUltimo pueblo del conjunto ordenado: " + ultimoPueblo);

  // Finalizar el programa
  return;
/*
  En este código se utiliza la interfaz SortedSet 
  y su implementación TreeSet para crear un conjunto de elementos ordenados. 
  Se utilizan los métodos add() para agregar pueblos al conjunto, size()
  */
  }
}
