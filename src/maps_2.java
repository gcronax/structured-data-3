import java.util.HashMap;
import java.util.Map;

public class maps_2 {
    public static void main(String[] args) {
        Map<String, Integer> contacto = new HashMap<String,Integer>();
        contacto.put("guille", 2312312);
        contacto.put("ayayin", 243432);
        contacto.put("perro", 234342);
        contacto.put("gato", 231555);


        System.out.println(contacto.get("guille"));

    }
}
