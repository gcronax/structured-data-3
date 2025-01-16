import java.util.HashSet;
import java.util.Scanner;

public class set_3 {
    public static void main(String[] args) {
        HashSet<Character> conjunto = new HashSet<>();
        HashSet<Character> conjuntoaux = new HashSet<>();


        Scanner scan= new Scanner(System.in);
        System.out.println("dame una palabara");
        char[] aux=scan.next().toCharArray();
        for (char c:aux){
            conjunto.add(c);
            if (conjunto.contains(c)){
                conjuntoaux.add(c);

            }
        }
        System.out.println(conjuntoaux);
    }
}
