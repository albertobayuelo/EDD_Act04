package u04_21a_List_forforechadowhile;

import java.util.ArrayList;
import java.util.List;

public class u04_21a {

    public static void main(String[] args) {
        // Declaración de la lista
        List<String> frutasTropicales = new ArrayList<>();

        // Agregamos los elementos a la lista
        frutasTropicales.add("mango");
        frutasTropicales.add("papaya");
        frutasTropicales.add("guanabana");
        frutasTropicales.add("piña");
        frutasTropicales.add("coco");
        frutasTropicales.add("maracuya");
        frutasTropicales.add("platano");

        // Usando un ciclo for tradicional
        for (int i = 0; i < frutasTropicales.size(); i++) {
            System.out.println(frutasTropicales.get(i));
        }

        // Usando un ciclo foreach
        for (String frutaTropical : frutasTropicales) {
            System.out.println(frutaTropical);
        }

        // Usando un ciclo while
        int i = 0;
        while (i < frutasTropicales.size()) {
            System.out.println(frutasTropicales.get(i));
            i++;
        }

        // Usando un ciclo do/while
        int p = 0;
        do {
            System.out.println(frutasTropicales.get(p));
            p++;
        } while (p < frutasTropicales.size());
    }
}
