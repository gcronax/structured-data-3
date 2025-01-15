import java.util.HashMap;
import java.util.Map;

public class maps_3 {
    public static void main(String[] args) {
        Map<String, Integer> contacto1 = new HashMap<String,Integer>();
        contacto1.put("guille", 2312312);
        contacto1.put("ayayin", 243432);
        contacto1.put("perro", 234342);
        contacto1.put("gato", 231555);
        Map<String, Integer> contacto2 = new HashMap<String,Integer>();
        contacto2.put("guille", 23133312);
        contacto2.put("ayayin", 244343);
        contacto2.put("perro", 234343);
        contacto2.put("gato", 2343434);


        System.out.println(contacto1.get("guille"));
        System.out.println(contacto2.get("guille"));

    }
}
