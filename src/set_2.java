import java.util.HashSet;
import java.util.Scanner;

public class set_2 {
    public static void main(String[] args) {
        HashSet<Character> conjunto = new HashSet<>();

        Scanner scan= new Scanner(System.in);
        System.out.println("dame una palabara");
        char[] aux=scan.next().toCharArray();
        for (char c:aux){
            conjunto.add(c);
        }

        System.out.println( conjunto);
    }
}
