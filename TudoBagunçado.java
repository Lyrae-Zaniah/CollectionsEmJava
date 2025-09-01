package Collections;

import java.util.HashSet;
import java.util.Set;

public class TudoBagunçado {

    @SuppressWarnings({"rawtypes", "unchecked"})
    public static void main(String[] args) {

        HashSet conjunto = new HashSet();
        conjunto.add(1.2);
        conjunto.add(1);
        conjunto.add(true);
        conjunto.add("mamaco");
        conjunto.add(5);
        conjunto.add('x');

        System.out.println("Tamanho é: " + conjunto.size());

        conjunto.remove("mamaco");

        System.out.println("Tamanho é: " + conjunto.size());

        System.out.println(conjunto.contains("mamaco"));
        System.out.println(conjunto.contains('x'));
        System.out.println(conjunto.contains(true));

        Set nums = new HashSet();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);
        System.out.println(conjunto);

        //conjunto.addAll(nums); // União entre dois conjuntos
        conjunto.retainAll(nums);
        System.out.println(conjunto);

        conjunto.clear();
        System.out.println(conjunto);

    }
}
