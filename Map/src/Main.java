import java.util.Map;
import java.util.TreeMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Map <String, String> cookies = new TreeMap<>();



        cookies.put("username", "Victor");
        cookies.put("email", "victor@gmail.com");
        cookies.put("phone", "9912421024");


        cookies.remove("email");
        cookies.put("phone" , "643643663");


        System.out.println(cookies.containsKey("phone"));

        System.out.println(cookies.get("phone"));

        System.out.println("email: " + cookies.get("email"));

        System.out.println(cookies.size());



        System.out.println("ALL COOKIEs: ");
        for (String key : cookies.keySet()){
            System.out.println(key + " " + cookies.get(key));
        }
    }
}