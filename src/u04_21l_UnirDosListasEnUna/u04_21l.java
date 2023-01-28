package u04_21l_UnirDosListasEnUna;
/**
 * @author DC
 * @author AB
 */
import java.util.List;
import java.util.ArrayList;

public class u04_21l{

    public static void main(String[] args) {

        // Creamos las dos listas a unir
        List<String> lista1 = new ArrayList<>();
        lista1.add("Isla Barú");
        lista1.add("Isla San Bernardo");
        lista1.add("Isla Tierra Bomba");

        List<String> lista2 = new ArrayList<>();
        lista2.add("Isla Fuerte");
        lista2.add("Isla San Martín");
        lista2.add("Isla de las Palmas"); 

        // Creamos la lista que contendrá la unión de las dos
        List<String> listaUnida = new ArrayList<>();

        // Unimos las dos listas usando un bucle for
        for (String isla : lista1) {
            listaUnida.add(isla);
        }
        for (String isla : lista2) {
            listaUnida.add(isla);
        }

        // Unimos las dos listas usando el método addAll
        listaUnida.addAll(lista1);
        listaUnida.addAll(lista2);

        // Imprimimos el contenido de la lista unida
        System.out.println("Contenido de la lista unida:"); 
        for (String isla : listaUnida) { 
            System.out.println(isla); 
        } 
    } 

}
