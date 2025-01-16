import java.util.HashSet;
import java.util.Iterator;

public class set_1 {

    public static HashSet<Integer> incrementarValores(HashSet<Integer> conjunto) {
        HashSet<Integer> conjuntoModificado = new HashSet<>();

        Iterator<Integer> iterador = conjunto.iterator();
        while (iterador.hasNext()) {
            int valor = iterador.next();
            conjuntoModificado.add(valor + 1);
        }

        return conjuntoModificado;
    }

    public static void main(String[] args) {
        HashSet<Integer> conjunto = new HashSet<>();
        conjunto.add(1);
        conjunto.add(2);
        conjunto.add(3);

        System.out.println("HashSet original: " + conjunto);

        HashSet<Integer> conjuntoModificado = incrementarValores(conjunto);
        System.out.println("HashSet modificado: " + conjuntoModificado);
    }
}

