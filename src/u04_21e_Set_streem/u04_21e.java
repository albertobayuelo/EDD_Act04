package u04_21e_Set_streem;
/**
 * @author DC
 * @author AB
 */
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class u04_21e {
    public static void main(String[] args) {
        //Declare un objeto Set llamado animalesSalvajes
        Set<String> animalesSalvajes = new HashSet<>(); 

        //Agregue los elementos a la Set
        animalesSalvajes.add("León");
        animalesSalvajes.add("Jaguar");
        animalesSalvajes.add("Oso");
        animalesSalvajes.add("Tigre");
        animalesSalvajes.add("Guepardo");
        animalesSalvajes.add("Mono");
        animalesSalvajes.add("Serpiente");
        animalesSalvajes.add("Elefante");
        animalesSalvajes.add("Cocodrilo");

        //Recorra la Set con Stream
        Stream<String> animalesSalvajesStream = animalesSalvajes.stream();

        //Imprima la salida con el método .forEach() que se aplica a la Set mediante el uso de una expresión lambda
        animalesSalvajesStream.forEach(animal -> System.out.println(animal));
    }
}