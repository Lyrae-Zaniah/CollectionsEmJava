package Collections;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

    public static void main(String[] args) {

        //Set<String> listaAprovados = new HashSet<String>();
        SortedSet<String> listaAprovados = new TreeSet<>();
        listaAprovados.add("Guilherme");
        listaAprovados.add("William");
        listaAprovados.add("Masqueico");
        listaAprovados.add("Retardeido");

        for(String canditados: listaAprovados) {
            System.out.println(canditados);
        }
    }
}
