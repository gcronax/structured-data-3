import java.util.HashMap;
import java.util.Map;

public class maps_1 {
    public static void main(String[] args) {
        Map<String, String> paises = new HashMap<String,String>();
        paises.put("España", "Madrid");
        paises.put("Paris", "Francia");

        System.out.println(paises.get("España"));

    }
}
