package u04_21c_Map_forforechadowhile;
/**
 * @author DC
 * @author AB
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class u04_21c {

    public static void main(String[] args) {

        Map<String, String> frutasTropicales = new HashMap<>();
        frutasTropicales.put("1", "Platanito");
        frutasTropicales.put("2", "Platano");
        frutasTropicales.put("3", "Mafufo");
        frutasTropicales.put("4", "Melon");
        frutasTropicales.put("5", "Patilla");
        frutasTropicales.put("6", "Naranja");
        frutasTropicales.put("7", "Limon");

        // for tradicional
        for (int i = 1; i <= frutasTropicales.size(); i++) {
            String key = String.valueOf(i);
            System.out.println("Key: " + key + ", Value: " + frutasTropicales.get(key));
        }

        System.out.println("\n*****\n");

        // foreach
        Set<Map.Entry<String, String>> entries = frutasTropicales.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        System.out.println("\n*****\n");
        // while
        int j = 1;
        while (j <= frutasTropicales.size()) {
            String key = String.valueOf(j);
            System.out.println("Key: " + key + ", Value: " + frutasTropicales.get(key));
            j++;
        }

        System.out.println("\n*****\n");
        // do/while
        int k = 1;
        do {
            String key = String.valueOf(k);
            System.out.println("Key: " + key + ", Value: " + frutasTropicales.get(key));
            k++;
        } while (k <= frutasTropicales.size());
    }
}
