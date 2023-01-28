package u04_21b_Set_forforechadowhile;

/**
 * @author DC
 * @author AB
 */

import java.util.HashSet;
import java.util.Set;

public class u04_21b {

    public static void main(String[] args) {

        Set<String> frutasTropicales = new HashSet<>();
        frutasTropicales.add("Mango");
        frutasTropicales.add("Papaya");
        frutasTropicales.add("Ananas");
        frutasTropicales.add("Guayaba");
        frutasTropicales.add("Lichee");
        frutasTropicales.add("Maracuya");
        frutasTropicales.add("Pitahaya");

        // Usamos for tradicional
        for (int i = 0; i < frutasTropicales.size(); i++) {
            System.out.println(frutasTropicales.toArray()[i]);
        }

        System.out.println("\n****\n");

        // usamos foreach
        for (String fruta : frutasTropicales) {
            System.out.println(fruta);
        }

        System.out.println("\n****\n");

        // aplicamos while
        int j = 0;
        while (j < frutasTropicales.size()) {
            System.out.println(frutasTropicales.toArray()[j]);
            j++;
        }

        System.out.println("\n****\n");

        //  usamos do/while
        int k = 0;
        do {
            System.out.println(frutasTropicales.toArray()[k]);
            k++;
        } while (k < frutasTropicales.size());
    }
}
