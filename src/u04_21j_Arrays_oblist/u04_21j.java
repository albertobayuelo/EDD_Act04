package u04_21j_Arrays_oblist;
/**
 * @author DC
 * @author AB
 */
import java.util.ArrayList; 
import java.util.List; 
public class u04_21j { 
public static void main(String[] args) 
{ 
    // Creamos un array de Strings
    String[] universidades = {"Universidad de Cartagena", "Universidad Tecnológica de Bolívar", 
                         "Universidad San Buenaventura", "Universidad Libre de Cartagena", 
                         "Universidad Antonio Nariño"}; 
    // Usamos el método asList() para convertir el array en un objeto List
    List<String> lista = new ArrayList<String>(java.util.Arrays.asList(universidades)); 
    // Mostramos el contenido de la List
    System.out.println("Contenido de la Lista:"); 
    for (String universidad : lista) { 
        System.out.println(universidad); 
    } 
} 

}