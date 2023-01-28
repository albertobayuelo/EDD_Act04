package u04_21g_List_flecha;
/**
 * @author DC
 * @author AB
 */
import java.util.List;
import java.util.ArrayList;
public class u04_21g {
public static void main(String[] args) {
    // Crear una Lista
    List<String> pueblosDeBolivar = new ArrayList<>();
    // Agregar elementos a la Lista
    pueblosDeBolivar.add("Coveñas");
    pueblosDeBolivar.add("Tiquisio");
    pueblosDeBolivar.add("San Pablo");
    pueblosDeBolivar.add("Simiti");
    pueblosDeBolivar.add("San Jacinto");
    pueblosDeBolivar.add("Majagual");
    pueblosDeBolivar.add("El Roble");
    pueblosDeBolivar.add("La Bodega");
    pueblosDeBolivar.add("El Carmen de Bolivar");
    pueblosDeBolivar.add("Sincerin");
    // Recorrer la Lista usando una función flecha 
    pueblosDeBolivar.forEach((pueblo) -> {
        System.out.println("Pueblo: " + pueblo);
    });
}

}