package Collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

    public static void main(String[] args) {

        Deque<String> livros = new ArrayDeque<>();

        livros.add("Perestroika");
        livros.add("Caralhosalados");
        livros.add("Ckya Blyat");
        livros.add("Zá rodinu");
        livros.push("Jawolh");

        System.out.println(livros.peek());
        System.out.println(livros.element());

        System.out.println(livros.poll());
        System.out.println(livros.pop());

        System.out.println(livros.size());
        System.out.println(livros.contains("Jawolh"));

        System.out.println(livros.peekFirst());
    }
}
