
package u04_02HashTable;

/**
 * @author AB
 * @author DC
 */

import java.util.Hashtable;
 
public class HashTable02 {
 
   public static void main(String args[]) {
 
      // Creamos una tabla hash
      Hashtable<String, Integer> numeros = new Hashtable<String, Integer>();
 
      // Agregamos elementos
      numeros.put("Daimer", 777);
      numeros.put("Alberto", 77);
      
 
      // Obtenemos el elemento con clave "Dos"
      Integer n = numeros.get("Alberto");
      if (n != null) {
         System.out.println("Alberto = " + n);
      }
   }
}