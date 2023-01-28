package u04_03Property;

/**
 *
 * @author AB
 * @author DC
 */

import java.lang.System;
import java.util.Properties;


public class Property03 { 
  public static void main(String[] args) { 
    //Obtenemos las propiedades del sistema
    Properties systemProperties = System.getProperties(); 


//Establecemos una nueva propiedad
systemProperties.setProperty("nombreBarrio", "LaConsolata"); 

//Imprimimos la nueva propiedad
System.out.println("El barrio de Daimer es: " + 
System.getProperty("nombreBarrio"));

} 
}
