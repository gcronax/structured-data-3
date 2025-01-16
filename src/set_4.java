import java.util.HashSet;
import java.util.Scanner;

public class set_4 {
    public static void main(String[] args) {
        HashSet<String> conjunto1 = new HashSet<>();
        HashSet<String> conjunto2 = new HashSet<>();
        HashSet<String> conjunto3 = new HashSet<>();


        for (String c:conjunto1){
            conjunto3.add(c);
        }
        for (String c:conjunto2){
            conjunto3.add(c);
        }
    }
}
