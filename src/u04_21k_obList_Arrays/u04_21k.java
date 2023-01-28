package u04_21k_obList_Arrays;
/**
 * @author DC
 * @author AB
 */
//declaramos la librería ArrayList y List
import java.util.ArrayList; 
import java.util.List; 

public class u04_21k { 
    public static void main(String[] args) 
    { 
        // Creamos una List de Strings 
        List<String> lugaresCartagena = new ArrayList<String>(); 
        // Agregamos los lugares de Cartagena en la List
        lugaresCartagena.add("Castillo de San Felipe de Barajas"); 
        lugaresCartagena.add("Plaza de los Coches"); 
        lugaresCartagena.add("Catedral de Santa Catalina"); 
        lugaresCartagena.add("Palacio de la Inquisición"); 
        lugaresCartagena.add("Fuerte de San Sebastián del Pastelillo"); 
        // Imprimimos el contenido de la List
        System.out.println("Contenido de la Lista:"); 
        for (String lugar : lugaresCartagena) { 
            System.out.println(lugar); 
        } 
        // Convertimos la List en un array
        String[] arrayLugaresCartagena = lugaresCartagena.toArray(new String[lugaresCartagena.size()]); 
        // Imprimimos el contenido del array
        System.out.println("\nContenido del array:"); 
        for (String lugar : arrayLugaresCartagena) { 
            System.out.println(lugar); 
        } 
    } 

}