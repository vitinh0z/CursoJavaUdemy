package Listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        
        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("João");
        list.add("Marco");
        list.add("Flavia");
        list.add("Roberto");
        list.add("BOb");

        list.add(2, "Victor"); 

        System.out.println("Tamanho da lista: " + list.size());



        for (String x : list){
            System.out.println(x);
        }

        System.out.println("\n--------------Lista alterada------------\n");




        list.remove("Roberto");
        list.removeIf(x -> x.charAt(0) == 'M'); // ------> predicado

        for (String x : list){
            System.out.println(x);
        }


        System.out.println("\n-----------------Nova lista alterada----------------\n");

        System.out.println("Index of: " + list.indexOf("Bob"));
        System.out.println("Index of Marco; " + list.indexOf("Marco"));

        System.out.println("\n----------------------------------------------\n");

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

        for (String x : result){
            System.out.println(x);
        }

        System.out.println("\n----------------------------\n");

        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);









    }
    
}
