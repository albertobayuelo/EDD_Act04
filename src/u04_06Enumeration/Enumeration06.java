package u04_06Enumeration;

/**
  * @author AB
  * @author DC
 */

import java.util.Enumeration;
import java.util.Vector;


public class Enumeration06 {
   public static void main(String[] args) {
      // Crea un Vector y agrega elementos a él
      Vector v = new Vector();
      v.add("Pan");
      v.add("Leche");
      v.add("Jugo");
      v.add("Carne");
      v.add("Verduras");

      // Obtiene el objeto Enumeration
      Enumeration e = v.elements();
      
      //Imprimimos el título para el listado de productos
      System.out.println("Productos disponibles en el inventario:");

      // Itera a través de los elementos del Vector
      while(e.hasMoreElements()) {
         //Obtenemos el siguiente elemento del Vector
         Object obj = e.nextElement();
         //Imprimimos en pantalla el producto
         System.out.println(obj);
      }
   }
}
/*El código crea un objeto Vector y agrega elementos a él, 
que en este caso son productos de una tienda de barrio. 
Luego, se obtiene un objeto Enumeration a partir del vector 
y se utiliza un bucle while para iterar 
a través de los elementos del Vector e imprimirlos en consola.
Se utiliza el método elements() para*/