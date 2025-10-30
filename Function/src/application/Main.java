import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("House", 50.00));
        list.add(new Product("Tablet", 129.00));
        list.add(new Product("HD Case", 90.90));


        List <String> name = list.stream().map(p-> p.getName().toUpperCase()).collect(Collectors.toList());


        name.forEach(System.out::println );

    }

}
