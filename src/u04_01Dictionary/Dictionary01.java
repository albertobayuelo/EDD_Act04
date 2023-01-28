
package u04_01Dictionary;

/**
 *
 * @author AB
 * @author DC
 */
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

public class Dictionary01 {
  public static void main(String[] args) {
    // Creamos un nuevo diccionario
    Dictionary<String, String> diccionario = new Hashtable<String, String>();
    
    // Agregamos algunas entradas al diccionario
    diccionario.put("Daimer", "FullStack");
    diccionario.put("Alberto", "IngSoft");
    diccionario.put("PC", "Computador");
    
    
    // Imprimimos el contenido del diccionario
    System.out.println("Contenido del diccionario:");
    Enumeration<String> claves = diccionario.keys();
    while (claves.hasMoreElements()) {
      String clave = claves.nextElement();
      String valor = diccionario.get(clave);
      System.out.println(clave + ": " + valor);
    }
    
    // Recuperamos un valor del diccionario
    String traduccion = diccionario.get("Daimer");
    System.out.println("El siginificado de  'Daimer' es '" + traduccion + "'.");
  }
}
