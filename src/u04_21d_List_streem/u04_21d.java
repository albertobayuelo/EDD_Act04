
package u04_21d_List_streem;

/**
 * @author DC
 * @author AB
 */

import java.util.ArrayList;
import java.util.List;


public class u04_21d {
    public static void main(String[] args) {
        // Declaración de la lista
        List animalesDomesticos = new ArrayList();


    // Agregamos los elementos a la lista
    animalesDomesticos.add("perro");
    animalesDomesticos.add("gato");
    animalesDomesticos.add("hamster");
    animalesDomesticos.add("conejo");
    animalesDomesticos.add("pajaro");
    animalesDomesticos.add("loro");
    animalesDomesticos.add("pez");

    // Recorriendo la lista con Stream
    animalesDomesticos.stream().forEach(animalDomestico -> System.out.println(animalDomestico));
}

}