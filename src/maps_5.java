import java.util.*;

public class maps_5 {
    public static void main(String[] args) {


        ArrayList<String> aux_list = new ArrayList<>();
        Map<String, Integer> aux_map = new HashMap<String, Integer>();
        Scanner scan = new Scanner(System.in);

        String aux = "";
        while (!Objects.equals(aux, "vacia")) {
            System.out.println("dame un nombre: ");
            aux = scan.next();
            if (!Objects.equals(aux, "vacia")){
                aux_list.add(aux);
            }
        }

        for (String i : aux_list) {
            if (aux_map.containsKey(i)) {
                aux_map.put(i, aux_map.get(i) + 1);
            } else {
                aux_map.put(i, 1);
            }
        }
        System.out.println(aux_map);


    }
}
