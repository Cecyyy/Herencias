import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Mounstruo sully = new Mounstruo("Sully",
                3.2,
                1000,
                false,
                true,
                "Azul",
                new ArrayList<>(Arrays.asList("Fuerte","Carismaticos","Gentil")));

        Chamaca Bo = new Chamaca(
                "Boo",
                0.50,
                20,
                "Blanca con flores rosas");


        sully.Espantar();
        Bo.llorar();


    }

}
