package Collections;

import java.util.HashSet;

public class Hash {

    public static void main(String[] args) {

        HashSet<Usuario> usuarios = new HashSet<Usuario>();

        usuarios.add(new Usuario("Perestroika"));
        usuarios.add(new Usuario("Caralhitos"));
        usuarios.add(new Usuario("Voadores"));
        usuarios.add(new Usuario("Retardadinho"));

        boolean resultado = usuarios.contains(new Usuario("Perestroika"));
        System.out.println(resultado);
    }
}
