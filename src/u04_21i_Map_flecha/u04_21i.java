package u04_21i_Map_flecha;
/**
 * @author DC
 * @author AB
 */
import java.util.HashMap;
import java.util.Map;
public class u04_21i {
    public static void main(String[] args) {
        // Creamos el Map
        Map universidades = new HashMap<>();
        universidades.put("UDC", "Universidad de Cartagena");
        universidades.put("UTB", "Universidad Tecnológica de Bolivar");
        universidades.put("USB", "Universidad San Buenaventura");
        universidades.put("ULA", "Universidad Libre de Cartagena");
// Usamos una función flecha para recorrer el Map
        universidades.forEach((clave, valor) -> System.out.println(clave + " - " + valor));
    }
}
