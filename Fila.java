package Collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();

        fila.add("Roberta"); // Lança uma exceção
        fila.add("Laguerta"); // Retorna False
        fila.offer("Carlinhos");
        fila.add("Perestroika");
        fila.offer("Napoleão");
        fila.offer("Mussum");

        System.out.println(fila.peek());
        System.out.println(fila.peek());
        System.out.println(fila.element());
        System.out.println(fila.element());
    }
}
