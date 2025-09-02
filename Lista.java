package Collections;

import java.util.ArrayList;

public class Lista {

    public static void main(String[] args) {
        ArrayList<Usuario> lista = new ArrayList<>();

        Usuario u1 = new Usuario("Ana");
        lista.add(u1);

        lista.add(new Usuario("Carlinhos"));
        lista.add(new Usuario("Bacural"));
        lista.add(new Usuario("Retardado"));
        lista.add(new Usuario("Manu"));

        System.out.println(lista.get(3));

        lista.remove(1);
        System.out.println(lista.remove(new Usuario("Retardado")));

        System.out.println(lista.contains(new Usuario("Bacural")));

        for (Usuario u: lista) {
            System.out.println(u.nome);
        }
    }
}
