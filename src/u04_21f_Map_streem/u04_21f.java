package u04_21f_Map_streem;

/**
 * @author DC
 * @author AB
 */
import java.util.Map;
import java.util.HashMap;

public class u04_21f {

    public static void main(String[] args) {

        // Crear un Map
        Map<String, String> insectosVenenosos = new HashMap<String, String>();

        // Agregar elementos al Map 
        insectosVenenosos.put("Escorpión", "Picadura letal");
        insectosVenenosos.put("Avispa", "Veneno extremadamente potente");
        insectosVenenosos.put("Araña", "Veneno paralizante");

        // Recorrer el Map usando Stream 
        insectosVenenosos.entrySet().stream().forEach(entry -> {
            System.out.println("Insecto: " + entry.getKey() + " - Veneno: " + entry.getValue());
        });
    }
}
