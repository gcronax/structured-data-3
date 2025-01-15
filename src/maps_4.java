import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;

public class maps_4 {
    public static void main(String[] args) {

        String[] aux_array= {"0004", "0347", "39804","58975", "25894", "52985", "98598" };
        Map<Integer, Integer> aux_map = new HashMap<Integer,Integer>();

        for (String i:aux_array){

            int x= Integer.parseInt(String.valueOf(i.charAt(i.length()-1)));

            if (aux_map.containsKey(x)){
                aux_map.put(x,aux_map.get(x)+1);
            }else {
                aux_map.put(x,1);
            }

        }
        System.out.println(aux_map);
        















    }
}
