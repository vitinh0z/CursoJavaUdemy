import entities.Product;
import entities.myComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.0));
        list.add(new Product("Notebook", 1200.0));
        list.add(new Product("Tablet", 450.0));


        list.sort((o1, o2) -> o1.getName().toUpperCase().compareTo(o2.getName().toUpperCase()));


        for (Product p : list){
            System.out.println(p);
        }


    }
}