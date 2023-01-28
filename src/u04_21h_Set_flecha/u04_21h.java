package u04_21h_Set_flecha;
/**
 * @author DC
 * @author AB
 */
import java.util.Set; 
import java.util.HashSet; 
public class u04_21h { 
    public static void main(String[] args) { 
        // Crea un conjunto y añade los barrios
        Set<String> barrios = new HashSet<String>(); 
        barrios.add("Mandela");
        barrios.add("Las Gaviotas");
        barrios.add("La Candelaria"); 
        barrios.add("El Pozón"); 
        barrios.add("Manga"); 
        barrios.add("Las Gavias");
        barrios.add("Ciudad Jardín");         
        barrios.add("Pie de la Popa"); 
        barrios.add("Getsemani"); 
        barrios.add("San Diego"); 
        barrios.add("La Matuna"); 
        barrios.add("El Cabrero"); 
        // Recorrer el conjunto usando Lambda
        barrios.forEach(barrio -> { 
            System.out.println(barrio); 
        }); 
    } 
} 