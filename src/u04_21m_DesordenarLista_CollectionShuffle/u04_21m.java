package u04_21m_DesordenarLista_CollectionShuffle;
/**
 *
 * @author AMBV
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class u04_21m {
	public static void main(String[] args) {
		// creamos una lista nueva
		List<String> nombresFemeninos = new ArrayList<String>();
		// agregamos 10 nombres femeninos a la lista
		nombresFemeninos.add("Liz");
		nombresFemeninos.add("Ana");
		nombresFemeninos.add("Juana");
		nombresFemeninos.add("María");
		nombresFemeninos.add("Sofía");
		nombresFemeninos.add("Nina");
		nombresFemeninos.add("Manuela");
		nombresFemeninos.add("Clara");
		nombresFemeninos.add("Giselle");
		nombresFemeninos.add("Adriana");
		// imprimimos la lista antes de desordenar
		System.out.println("Lista antes de desordenar: ");
		for (String nombre : nombresFemeninos) {
			System.out.println(nombre);
		}
		// desordenamos la lista
		Collections.shuffle(nombresFemeninos);
		// imprimimos la lista después de desordenar
		System.out.println("\nLista después de desordenar: ");
		for (String nombre : nombresFemeninos) {
			System.out.println(nombre);
		}
	}
}