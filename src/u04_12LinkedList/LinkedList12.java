package u04_12LinkedList;

/**
 *@author DC
 *@author AB
 */

import java.util.LinkedList; 
 
public class LinkedList12 { 
    public static void main(String[] args) { 
  
        // Crear una lista enlazada de asignaturas de ingeniería de software 
        LinkedList<String> asignaturas = new LinkedList<String>(); 
  
        // Agregar elementos a la lista enlazada 
        asignaturas.add("Programación"); 
        asignaturas.add("Calidad de software"); 
        asignaturas.add("Ingeniería de requisitos"); 
        asignaturas.add("Arquitectura de software"); 
        asignaturas.add("Metodologías ágiles");
        asignaturas.add("Gestión de proyectos");
        asignaturas.add("Seguridad de software");
        asignaturas.add("Modelos de ciclo de vida");
        asignaturas.add("Ingeniería del conocimiento");
        asignaturas.add("Inteligencia artificial");
  
        // Mostrar los elementos de la lista enlazada
        System.out.println("Asignaturas de ingeniería de software: "); 
        for (String str : asignaturas) { 
            System.out.println(str); 
        } 
  
        // Agregar un elemento al comienzo de la lista enlazada 
        asignaturas.addFirst("Matemáticas aplicadas"); 
  
        // Agregar un elemento al final de la lista enlazada 
        asignaturas.addLast("Tecnología de la información"); 
  
        // Mostrar los elementos de la lista enlazada 
        System.out.println("\nAsignaturas de ingeniería de software después de agregar elementos al comienzo y al final:"); 
        for (String str : asignaturas) { 
            System.out.println(str); 
        } 
  
        // Ob// Obtener un elemento de la lista enlazada
Object elemento = asignaturas.get(2);
System.out.println("\nAsignatura obtenida de la lista enlazada en la posicion 2: " + elemento);
    // Remover un elemento de la lista enlazada 
    asignaturas.removeFirst();
    
    // Mostrar los elementos de la lista enlazada despues de remover el elemento
    System.out.println("\nAsignaturas de ingeniería de software despues de remover primer elemento:"); 
    for (String str : asignaturas) { 
        System.out.println(str); 
    } 
    return;
} 
}