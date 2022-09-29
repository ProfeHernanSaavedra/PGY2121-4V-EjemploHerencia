
import java.util.ArrayList;

/**
 *
 * @author USRVI-LC2
 */
public class TestJoya {

    public static void main(String[] args) {

        Cadena cadenita = new Cadena(20, 1, "cadena grande", "plata");
        System.out.println(cadenita.toString());

        Anillo marvel = new Anillo(5, 2, "Anillo Hulk", "oro");
        System.out.println(marvel.toString());

        ArrayList<Joya> listaJoyas = new ArrayList<>();
        listaJoyas.add(cadenita);
        listaJoyas.add(marvel);

        System.out.println(listaJoyas);

        for (Joya joyas : listaJoyas) {

            System.out.println(joyas.getNombre() + "-" + joyas.getMaterial());

        }
    }

}

