package application;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import entities.Product;
import util.PriceUpdate;

public class App {
    public static void main(String[] args) throws Exception {
        
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.0));
        list.add(new Product("Mouse", 78.0));
        list.add(new Product("Tablet", 30.0));
        list.add(new Product("HD Case", 760.0));


        list.forEach(p -> p.setPrice(p.getPrice() * 1.1));

        list.forEach(System.out::println);


    }
}
